package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
  @Id
  private String username;
  private String password;
  private String role;
  
  public User() {
  }

  public User(String username,  String password) {
    this.username = username;
    this.password = password;
    this.role="USER";
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
	this.username = username;
  }

  public String getPassword() {
	 return password;
  }

  public void setPassword(String password) {
	 this.password = password;
  }
  public void setRole() {
	  this.role="USER";
  }

public String getRole() {
	return role;
}



}
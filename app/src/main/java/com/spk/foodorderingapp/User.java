package com.spk.foodorderingapp;

public class User {

    private int userId;
    private String name;
    private String phoneNumber;
    private String email;
    private String role;
   
    public User(int userId, String name, String phoneNumber, String email, String role) {
    this.userId = userId;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.role = role;
}

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
    public void login() {
    System.out.println(name + " logged in");
    }
    public void logout() {
    System.out.println(name + " logged out");
    }

}

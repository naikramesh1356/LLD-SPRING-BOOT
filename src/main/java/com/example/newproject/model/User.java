package com.example.newproject.model;

public class User {
    public int id;
    public String role; // Admin or user

    public User(int id, String role) {
        this.id=id;
        this.role=role;
    }

    public int getId() {return  id;}
    public String getRole() {return role;}

}

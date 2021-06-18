package com.learn.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    public int id;
    public String userName;
    public String email;

    public User(int id, String username,String email) {
        this.userName = userName;
        this.email = email;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(int id) {}

    public User(String userName, String email) {

    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, username='%s', email='%s']",
                id, userName, email);
    }

    public int getId() {
        return id;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

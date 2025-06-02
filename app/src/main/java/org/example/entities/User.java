package org.example.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashPassword;

    private List<Ticket> tickesBooked;
    private String userId;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public List<Ticket> getTickesBooked() {
        return tickesBooked;
    }

    public void setTickesBooked(List<Ticket> tickesBooked) {
        this.tickesBooked = tickesBooked;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

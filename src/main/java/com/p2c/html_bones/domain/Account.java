package com.p2c.html_bones.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 8751282105532159742L;

    private int userId;
    private String username;
    private String password;

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


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

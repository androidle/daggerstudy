package com.thinkcoo.www.draggertest;

import javax.inject.Inject;

import dagger.Reusable;

/**
 * Created by admin on 2016/5/23.
 */
@Reusable
public class User {

    @Inject
    public User() {
        System.out.println("=======create user===constructor======");
    }

    public void call() {
        System.err.println("=========hello world ========");
    }

    private String userName = "zhang";
    private String password = "abc123456";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserModule{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

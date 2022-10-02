package com.example.sobblogsystem.pojo;

import java.io.Serializable;

/**
 * @Author: immorts
 * @Description: TODO
 * @Date: Created in 11:33 PM 2022/5/1 2022
 * @Modified By:
 */
public class User implements Serializable {
    private String userName;

    private String password;
    private int age;
    private String gender;

    public User(String userName, int age, String gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

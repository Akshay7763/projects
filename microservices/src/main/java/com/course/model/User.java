package com.course.model;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {

    private int id;
    @Size(min=3,message="name should contain 3 words")
    private String userName;
    @Past(message="Birth date should be in past ")
    private LocalDate birthday;


    public User(int id, String userName, LocalDate birthday) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
    }

    public int getUserId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

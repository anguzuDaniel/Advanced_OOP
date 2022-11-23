package com.layout_objects;

import java.io.Serializable;

public class Student implements Serializable {
    private static int count = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private Gender gender;

    public Student(String firstName, String lastName, String password, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.password = password;
        this.id = count;
        count++;
    }

    public Student(int id, String firstName, String lastName, String password, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.gender = gender;
        count++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

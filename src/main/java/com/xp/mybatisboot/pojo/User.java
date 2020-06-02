package com.xp.mybatisboot.pojo;

public class User {
    private long phone;
    private String name;
    private String gender;
    private int age;

    public User() {
    }

    public User(long phone, String name, String gender, int age) {
        this.phone = phone;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

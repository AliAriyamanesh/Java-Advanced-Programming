package com.company;

public class User {
    private String name;
    private String username;
    private String password;
    private int age;
    private String  address;
    private String phone;
    private String degree;
    public User(){}
    public void printInf(){
        System.out.println("name:"+name+" \nusername:"+username+" \npassword:"+password+" \nage:"+age+" \naddress:"+address+" \nphone:"+phone+"\ndegree:"+degree);
    }
    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public User setDegree(String degree) {
        this.degree = degree;
        return this;
    }
}

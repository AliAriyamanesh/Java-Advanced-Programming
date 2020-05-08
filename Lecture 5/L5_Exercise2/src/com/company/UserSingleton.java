package com.company;

public class UserSingleton {
    private UserSingleton(){}
    private String username;
    private String password;
    private String name;
    private static UserSingleton userSingleton=new UserSingleton();
    public static UserSingleton getInstance (){return userSingleton;}
    public void printInf(){
        System.out.println("name : "+name+"\nusername : "+username+"\npassword : "+password);
    }
    public String getUsername() {
        return username;
    }

    public UserSingleton setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserSingleton setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserSingleton setName(String name) {
        this.name = name;
        return this;
    }
}

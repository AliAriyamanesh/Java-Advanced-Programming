package com.company;

public class User  <User,Pass> implements Cloneable {
    private User user;
    private Pass pass;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pass getPass() {
        return pass;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }
    public User (){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

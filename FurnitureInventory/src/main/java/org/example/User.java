package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {

    private String name;
    private int userid;
    private String role;



    public User(String name, int userid, String role)
    {
        this.name = name;
        this.userid = userid;
        this.role = role;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



}

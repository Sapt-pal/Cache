package com.example.cache;

public class client_data {
    private String username;
    private String pswd;
    public client_data(String username, String pswd) {  //parameterized constructor
        this.username = username;
        this.pswd = pswd;
    }

    public client_data() {              //default constructor for a future scenario
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Override
    public String toString() {      //useful to return human readable info of object's current state
        return "client_data{" +
                "username='" + username + '\'' +
                ", pswd='" + pswd + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPswd() {
        return pswd;
    }
}

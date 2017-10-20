package com.example.bleitzel.collegeapp;

/**
 * Created by bleitzel on 10/6/2017.
 */

public class Profile {

    private String firstname;
    private String objectid;
    private String lastname;
    private String email;


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Profile(String objectid){
        this.objectid = objectid;
        this.firstname = "Sion";
        this.lastname = "Mack";
    }
    public Profile(String first, String last){
        this.firstname = first;
        this.lastname = last;
    }

    public String getObjectid() {
        return objectid;
    }



    public Object getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
}

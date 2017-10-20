package com.example.bleitzel.collegeapp;

/**
 * Created by bleitzel on 10/6/2017.
 */

public abstract class FamilyMember {
    private String firstname;
    private String lastname;

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

    public FamilyMember(){
        firstname = "John";
        lastname = "Smith";

    }
    public FamilyMember (String first, String last){

    }
}

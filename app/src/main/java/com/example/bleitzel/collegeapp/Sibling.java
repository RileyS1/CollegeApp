package com.example.bleitzel.collegeapp;

public class Sibling extends FamilyMember{

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

    public Sibling(){
        this.firstname = "Glip";
        this.lastname = "Glop";
    }
    public Sibling(String first, String last){
        this.firstname = first;
        this.lastname = last;
    }
}

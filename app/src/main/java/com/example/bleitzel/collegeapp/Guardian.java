package com.example.bleitzel.collegeapp;

/**
 * Created by bleitzel on 10/6/2017.
 */

public class Guardian extends FamilyMember{
    private String occupation;

    public String getLastname() {
        return super.getLastname();
    }

    public void setLastname(String lastname) {
        super.setLastname(lastname);
    }

    public String getFirstname() {
        return super.getFirstname();
    }

    public void setFirstname(String firstname) {
         super.setFirstname(firstname);
    }
    private void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public Guardian(String first, String last){
        this.setFirstname(first);
        this.setLastname(last);

    }


}

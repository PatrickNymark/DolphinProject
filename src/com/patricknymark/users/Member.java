package com.patricknymark.users;

import java.util.ArrayList;

public class Member extends User {
    private boolean isActive;
    private boolean isElite;
    private boolean isSenior;
    private boolean seniorDiscount;
    private Coach coach;
    private ArrayList<String> disciplines;

    // This constructor is used to create non elite swimmers.
    // The system will know its a non elite since there is no coach parameter.
    public Member(String firstName, String lastName, String phoneNumber, String email, int age, String password, ArrayList<String> disciplines) {
        super(firstName, lastName, phoneNumber, email, age, password);
        this.disciplines = disciplines;

        // Since a membership is always active when creating a new object we set isActive to true.
        this.isActive = true;

        // Since this constructor is only used when creating non elite swimmers we set isElite to false.
        this.isElite = false;

        // We call setMembership because we want to set the attributes on creation.
        setMembership();
    }

    // This constructor is used to create non elite swimmers.
    // The system will know its a elite since there is a coach parameter.
    public Member(String firstName, String lastName, String phoneNumber, String email, int age, String password, Coach coach, ArrayList<String> disciplines) {
        super(firstName, lastName, phoneNumber, email, age, password);
        this.disciplines = disciplines;
        this.coach = coach;

        // Same as above constructor
        this.isElite = true;
        this.isActive = true;

        setMembership();
    }

     private void setMembership() {
        if(this.getAge() < 18) {
            this.isSenior = false;
        } else if(this.getAge() >= 18  && this.getAge() < 60) {
            this.isSenior = true;
        } else if(this.getAge() >= 60) {
            this.isSenior = true;
            this.seniorDiscount = true;
        }
    }

    // GETTERS
    public boolean isActive() {
        return isActive;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public boolean isSeniorDiscount() {
        return seniorDiscount;
    }

    public boolean isElite() {
        return isElite;
    }

    public Coach getCoach() {
        return coach;
    }


}

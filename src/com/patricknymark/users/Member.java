package com.patricknymark.users;

import java.util.ArrayList;

public class Member extends User {
    private boolean isActive;
    private boolean isElite;
    private boolean isSenior;
    private boolean seniorDiscount;
    private Coach coach;
    private ArrayList<String> disciplines;


    public Member(String firstName, String lastName, String phoneNumber, String email, int age, String password, ArrayList<String> disciplines) {
        super(firstName, lastName, phoneNumber, email, age, password);
        this.disciplines = disciplines;
        this.isActive = true;
        this.isElite = false;

        setMembership();
    }

    public Member(String firstName, String lastName, String phoneNumber, String email, int age, String password, Coach coach, ArrayList<String> disciplines) {
        super(firstName, lastName, phoneNumber, email, age, password);
        this.disciplines = disciplines;
        this.coach = coach;
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

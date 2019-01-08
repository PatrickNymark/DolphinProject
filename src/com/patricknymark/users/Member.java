package com.patricknymark.users;

public class Member extends User {
    private boolean isActive;
    private boolean isElite;
    private boolean isSenior;
    private boolean seniorDiscount;
    private String[] disciplines;

    public Member(String firstName, String lastName, String phoneNumber, String email, int age, boolean isElite, String[] disciplines) {
        super(firstName, lastName, phoneNumber, email, age);
        this.disciplines = disciplines;
        this.isElite = isElite;
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


}

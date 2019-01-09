package com.patricknymark.users;

import java.util.ArrayList;

public class Coach extends User {
    private ArrayList<Member> eliteSwimmers;

    public Coach(String firstName, String lastName, String phoneNumber, String email, int age, String password) {
        super(firstName, lastName, phoneNumber, email, age, password);
        this.eliteSwimmers = new ArrayList<>();
    }

    public void addEliteSwimmer(Member member) {
        if(!eliteSwimmers.contains(member)) {
            eliteSwimmers.add(member);
        }
    }

    @Override
    public String toString() {
        return "Coach{" +
                "eliteSwimmers=" + eliteSwimmers +
                '}';
    }
}

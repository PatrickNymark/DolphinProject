package com.patricknymark.users;

import java.util.ArrayList;

public class Coach extends User {
    // This is a list of Member objects (Member class instances)
    private ArrayList<Member> eliteSwimmers;

    public Coach(String firstName, String lastName, String phoneNumber, String email, int age, String password) {
        super(firstName, lastName, phoneNumber, email, age, password);

        // This is to instantiate an empty arraylist on creation.
        // Since we dont have a parameter for an arraylist in the constructor, we have to create an empty, else we get null pointer exception.
        this.eliteSwimmers = new ArrayList<>();
    }

    // This method is for adding an elite swimmer to the list eliteSwimmers which belongs to each instance of Coach we create.
    public void addEliteSwimmer(Member member) {
        // Checks if the arraylist contains the member. If it contains it returns true, therefore i flip it with !.
        // So if it does not contain, add the member to the list.
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

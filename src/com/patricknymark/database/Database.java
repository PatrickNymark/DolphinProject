package com.patricknymark.database;

import com.patricknymark.users.Coach;
import com.patricknymark.users.Manager;
import com.patricknymark.users.Member;

import java.util.ArrayList;

public class Database {
    // This class is kind of the base database, and we need to store 3 lists. Members, Coaches and Managers.
    // We make them static so that it doesnt belong to the instance we create but the class itself.
    // This is to make them editable from other classes, if they were not static, and we wanted to add to one
    // of the lists from another class, we would have to create a new instance of the Database, which would then be empty lists.
    private static ArrayList<Member> members;
    private static ArrayList<Coach> coaches;
    private static ArrayList<Manager> managers;
    // private static ArrayList<Manager> managers = new Arraylist<>();

    // Constructor
    // We create empty lists, else we would get null pointer exception. (this could be done like above without constructor)
    public Database() {
        members = new ArrayList<>();
        coaches = new ArrayList<>();
        managers = new ArrayList<>();
    }

    // GETTERS
    public static ArrayList<Member> getMembers() {
        return members;
    }

    public static ArrayList<Coach> getCoaches() {
        return coaches;
    }

    public static ArrayList<Manager> getManagers() {
        return managers;
    }
}

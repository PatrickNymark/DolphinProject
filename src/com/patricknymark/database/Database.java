package com.patricknymark.database;

import com.patricknymark.users.Coach;
import com.patricknymark.users.Manager;
import com.patricknymark.users.Member;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Member> members;
    private static ArrayList<Coach> coaches;
    private static ArrayList<Manager> managers;

    public Database() {
        members = new ArrayList<>();
        coaches = new ArrayList<>();
        managers = new ArrayList<>();
    }

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

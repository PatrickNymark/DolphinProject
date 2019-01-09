package com.patricknymark.database;

import com.patricknymark.users.Manager;

public class ManagerDB {

    public static void addManager(Manager manager) {
        if(!Database.getManagers().contains(manager)) {
            Database.getManagers().add(manager);
        }
    }
}

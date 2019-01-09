package com.patricknymark.database;

import com.patricknymark.users.Manager;

public class ManagerDB {

    // Same as CoachDB, this is the Manager controller of the Database.
    // Read comment in CoachDB. Same principles.
    public static void addManager(Manager manager) {
        // Check if the managers list contains the manager. We flip with !
        // So if it does not contain, add the manager.
        if(!Database.getManagers().contains(manager)) {
            Database.getManagers().add(manager);
        }
    }
}

package com.patricknymark.database;

import com.patricknymark.users.Coach;

public class CoachDB {

    // This is kind of the Coach controller of the database.
    // We only use this class to manipulate the lists in Database, and again its a static method because
    // we want to access this method from other classes without creating a new instance of CoachDB. (Read comment in database)
    public static void addCoach(Coach coach) {
        // Checks if the list of coaches contains the coach, we flip it with !
        // So if it does not contain, add the coach.
        if(!Database.getCoaches().contains(coach)) {
            Database.getCoaches().add(coach);
        }
    }
}

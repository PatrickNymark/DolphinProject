package com.patricknymark.database;

import com.patricknymark.users.Coach;

public class CoachDB {

    public static void addCoach(Coach coach) {
        if(!Database.getCoaches().contains(coach)) {
            Database.getCoaches().add(coach);
        }
    }
}

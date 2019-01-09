package com.patricknymark.database;

import com.patricknymark.accounting.Accounting;
import com.patricknymark.accounting.Transaction;
import com.patricknymark.users.Member;

public class MemberDB {

    // Same as CoachDB, this is the Manager controller of the Database.
    // Read comment in CoachDB. Same principles.
    public static void addMember(Member member) {
        // We call the getMembers method in the Database to get the members list, and then we check
        // if it contains returns true therefore ! to flip it. If it does not contain.
        if(!Database.getMembers().contains(member)) {
            // We then check if the member is Elite, if it is, we also want
            // to add the new member to the list of eliteSwimmers that the given coach has.
            if(member.isElite()) {
                member.getCoach().addEliteSwimmer(member);
            }

            // This needs to happen if the member is elite or not.
            // So the if statement above only adds member to the coach list.
            // Here we add the new member to the list of members both elites and non elites.
            Database.getMembers().add(member);

            // This is the add a new transaction when a member is added.
            // Since when a members is added, he also needs to pay.
            Accounting.addTransaction(new Transaction(member));
        }
    }


}

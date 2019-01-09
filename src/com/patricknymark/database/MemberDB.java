package com.patricknymark.database;

import com.patricknymark.accounting.Accounting;
import com.patricknymark.accounting.Transaction;
import com.patricknymark.users.Member;

public class MemberDB {

    public static void addMember(Member member) {
        if(!Database.getMembers().contains(member)) {
            if(member.isElite()) {
                member.getCoach().addEliteSwimmer(member);
            }

            Database.getMembers().add(member);
            Accounting.addTransaction(new Transaction(member));
        }
    }

}

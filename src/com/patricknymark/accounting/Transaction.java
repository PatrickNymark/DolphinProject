package com.patricknymark.accounting;

import com.patricknymark.users.Member;

public class Transaction {
    private int transactionID;
    private double amount;
    private Member member;

    private static int id = 1000;

    public Transaction(Member member) {
        if(!member.isActive()) {
            this.amount = 500;
        } else if(member.isSenior() && !member.isSeniorDiscount()) {
            this.amount = 1600;
        } else if(member.isSenior() && member.isSeniorDiscount()) {
            this.amount = 1600 * 0.75;
        } else {
            this.amount = 1000;
        }

        this.member = member;

        generateId();
    }

    private void generateId() {
        this.transactionID = id++;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public double getAmount() {
        return amount;
    }
}

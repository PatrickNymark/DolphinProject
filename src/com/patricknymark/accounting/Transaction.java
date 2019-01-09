package com.patricknymark.accounting;

import com.patricknymark.users.Member;

public class Transaction {
    private int transactionID;
    private double amount;
    private Member member;

    // Same as userID. We generate a transactionID.
    private static int id = 1000;

    public Transaction(Member member) {
        this.member = member;
        generatePayment();
        generateId();
    }

    // This method calculates the actual price the members has to give.
    // Remember  these isActive, isSenior is set by the constructor when a member is created.
    private void generatePayment() {
        // If not isActive
        if(!member.isActive()) {
            this.amount = 500;
            // If member isSenior (> 18) and is not isSeniorDiscount (< 60)
        } else if(member.isSenior() && !member.isSeniorDiscount()) {
            this.amount = 1600;
            // isSenior and isSeniorDiscount (> 60)
        } else if(member.isSenior() && member.isSeniorDiscount()) {
            this.amount = 1600 * 0.75;
        } else {
            // If non if the above conditions, it must be a junior (< 18)
            this.amount = 1000;
        }
    }

    // GETTERS
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

package com.patricknymark.accounting;

import java.util.ArrayList;

public class Accounting {
    private static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public static ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}

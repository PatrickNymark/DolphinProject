package com.patricknymark.views;

import com.patricknymark.accounting.Accounting;
import com.patricknymark.accounting.Transaction;

public class AccountingView {

    public void printTransactions() {
        for(Transaction transaction : Accounting.getTransactions()) {
            System.out.println(transaction.getAmount() + " - " + transaction.getTransactionID());
        }
    }
}

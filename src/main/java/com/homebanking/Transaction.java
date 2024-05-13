package com.homebanking;

import java.util.Date;

public class Transaction {
    private Date dateTime;
    private String transactionType;
    private double amount;

    public Transaction(Date dateTime, String transactionType, double amount) {
        this.dateTime = dateTime;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionDetails() {
        return "Date: " + dateTime + ", Type: " + transactionType + ", Amount: " + amount;
    }

    public boolean isValidTransaction() {
        return amount >= 0;
    }
}
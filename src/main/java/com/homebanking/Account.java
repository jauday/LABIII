package com.homebanking;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Account {
    private UUID id;
    private String accountNumber;
    private String accountType;
    private double balance;
    private Date openingDate;
    private Customer customer;
    private List<Transaction> transactions;

    public Account(String accountNumber, String accountType, double balance, Date openingDate, Customer customer) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.openingDate = openingDate;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(new Date(), "Deposit", amount));
    }

    private void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(new Date(), "Withdrawal", amount));
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    private void transfer(Account toAccount, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            toAccount.deposit(amount);
            transactions.add(new Transaction(new Date(), "Transfer to " + toAccount.getAccountNumber(), amount));
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    private double checkBalance() {
        return balance;
    }

    private List<Transaction> getTransactionHistory() {
        return transactions;
    }
}

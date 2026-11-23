package com.banking.model;

public class Transaction {
    public enum TransactionType {
        DEPOSIT,
        WITHDRAW,
        TRANSFER
    }

    private long transactionId;
    private long accountNumber;
    private TransactionType transactionType;
    private double ammount;
    private long transactionReference;          // Foreign key to the other account's Transaction Object.

}

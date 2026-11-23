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
    private double amount;
    private long transactionReference;          // Foreign key to the other account's Transaction Object.

    public Transaction(long transactionId, long accountNumber, TransactionType transactionType, double amount, long transactionReference) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionReference = transactionReference;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

package com.banking.model;

import java.util.Date;

import com.banking.exception.InsufficientBalanceException;

/**
 * My intended flow will be 
 *      1. Some UI or code flow will trigger account creation 
 *      2. I'll create in the database first, to handle automatic ID incrementing and createdAt date
 *      3. I'll create the java object after database success
 *      4. I'll check that java side account creation succeeds and delete the DB row if not.
 * Account
 */

public abstract class Account {
    private long accountNumber;            // I'll generate uniquely via mysql
    private long customerId;
    private double balance;     // Will we use double since it's imprecise?? or a long 
    private Date createdAt;     // Will set to DB value

    public Account(long accountNumber, long customerId, double balance, Date createdAt) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
        this.createdAt = createdAt;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /** Accounts are equal if they have the same account number (DB primary key) and concrete type. */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account other = (Account) o;
        return accountNumber == other.accountNumber;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(accountNumber);
    }
}

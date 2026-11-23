package com.banking.model;

import java.util.Date;

import com.banking.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {
    private final static int MIN_BALANCE = 100; // Minimum balance for a savings account
    
    public SavingsAccount(long accountNumber, long customerId, double balance, Date createdAt) {
        super(accountNumber, customerId, balance, createdAt);
    }

    @Override 
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (getBalance() - amount < MIN_BALANCE) {
            throw new InsufficientBalanceException("Withdrawal would result in balance below minimum required balance of " + MIN_BALANCE);
        }
        super.withdraw(amount);
    }
}

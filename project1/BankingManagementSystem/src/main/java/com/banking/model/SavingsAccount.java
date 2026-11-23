package com.banking.model;

import java.util.Date;

public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, long customerId, double balance, Date createdAt) {
        super(accountNumber, customerId, balance, createdAt);
    }
}

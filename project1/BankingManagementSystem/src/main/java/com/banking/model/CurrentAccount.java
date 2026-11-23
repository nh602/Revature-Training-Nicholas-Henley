package com.banking.model;

import java.util.Date;

public class CurrentAccount extends Account {
    public CurrentAccount(long accountNumber, long customerId, double balance, Date createdAt) {
        super(accountNumber, customerId, balance, createdAt);
    }
}

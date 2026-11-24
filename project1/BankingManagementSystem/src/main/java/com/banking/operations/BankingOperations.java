package com.banking.operations;

import com.banking.BankOperations;
import com.banking.exception.InsufficientBalanceException;
import com.banking.exception.InvalidAccountException;
import com.banking.model.Account;
import com.banking.model.Customer;

/** JDBC-backed implementation of {@link BankOperations}. */
public class BankingOperations implements BankOperations {
    // TODO: replace these placeholder stubs with real JDBC implementations

    @Override
    public Account createAccount(long customerId, double initialDeposit) {
        return null;
    }

    @Override
    public void deleteAccount(long accountNumber) throws InvalidAccountException {
    }

    @Override
    public Account updateAccount(long accountNumber, double newBalance) throws InvalidAccountException {
        return null;
    }

    @Override
    public Account getAccountDetails(long accountNumber) throws InvalidAccountException {
        return null;
    }

    @Override
    public void deposit(long accountNumber, double amount) throws InvalidAccountException {
    }

    @Override
    public void withdraw(long accountNumber, double amount)
            throws InsufficientBalanceException, InvalidAccountException {
    }

    @Override
    public void transfer(long fromAccountNumber, long toAccountNumber, double amount)
            throws InsufficientBalanceException, InvalidAccountException {
    }

    @Override
    public double getBalance(long accountNumber) throws InvalidAccountException {
        return 0;
    }

    @Override
    public Customer createCustomer(String firstName, String lastName, String email, String phoneNumber) {
        return null;
    }

    @Override
    public void deleteCustomer(long customerId) {
    }

    @Override
    public Customer updateCustomer(long customerId, String firstName, String lastName, String email,
            String phoneNumber) {
        return null;
    }

    @Override
    public Customer getCustomerDetails(long customerId) {
        return null;
    }
}

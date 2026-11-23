package com.banking;

import com.banking.exception.InsufficientBalanceException;
import com.banking.exception.InvalidAccountException;
import com.banking.model.Account;
import com.banking.model.Customer;

/** Interface defining the bank's operations (create account, deposit, withdraw, transfer, ...). */
public interface BankOperations {
    public Account createAccount(long customerId, double initialDeposit);
    public void deleteAccount(long accountNumber)
        throws InvalidAccountException;
    public Account updateAccount(long accountNumber, double newBalance)
        throws InvalidAccountException;
    public Account getAccountDetails(long accountNumber) 
        throws InvalidAccountException;

    public void deposit(long accountNumber, double amount)
        throws InvalidAccountException;
    public void withdraw(long accountNumber, double amount) 
        throws InsufficientBalanceException, InvalidAccountException;
    public void transfer(long fromAccountNumber, long toAccountNumber, double amount) 
        throws InsufficientBalanceException, InvalidAccountException;
    
    public double getBalance(long accountNumber)
        throws InvalidAccountException;

    public Customer createCustomer(String firstName, String lastName, String email, String phoneNumber);
    public void deleteCustomer(long customerId);
    public Customer updateCustomer(long customerId, String firstName, String lastName, String email, String phoneNumber);
    public Customer getCustomerDetails(long customerId);

}   

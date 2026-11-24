package com.banking;

import java.util.ArrayList;

import com.banking.model.*;
import com.banking.utility.*;

public class Main {
    // Arraylist
    ArrayList<Account> accounts = new ArrayList<>();
    ArrayList<Transaction> transactions = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();

    static BankOperations bo = null;

    enum BANK_OP {
        CREATE_ACCOUNT,
        UPDATE_ACCOUNT,
        READ_ACCOUNT,
        DELETE_ACCOUNT,
        TRANSFER_FUNDS,
        WITHDRAW_FUNDS,
        DEPOSIT_FUNDS,
        CREATE_CUSTOMER,
        UPDATE_CUSTOMER,
        READ_CUSTOMER,
        DELETE_CUSTOMER,
        LIST_CUSTOMERS
    }

    // REPL for handling account ops
    private static BANK_OP accountReplHelper() {
        BANK_OP out = null;
        do {
            System.out.println("1. CREATE Account");
            System.out.println("2. UPDATE Account");
            System.out.println("3. READ Account");
            System.out.println("4. DELETE Account");
            System.out.println("5. Go back");

            int option = InputUtility.getIntInput("? ");
            switch (option) {
                case 1:
                    out = BANK_OP.CREATE_ACCOUNT;
                    break;
                case 2:
                    out = BANK_OP.UPDATE_ACCOUNT;
                    break;
                case 3:
                    out = BANK_OP.READ_ACCOUNT;
                    break;
                case 4:
                    out = BANK_OP.DELETE_ACCOUNT;
                    break;
                case 5:
                    return null; // short circuit method to go back
                default:
                    System.out.println("Error: expected 1-5");
            }
        } while(out == null);

        return out;
    }

    // REPL for handling funds
    private static BANK_OP fundsReplHelper() {
        BANK_OP out = null;
        do {
            System.out.println("1. TRANSFER Funds");
            System.out.println("2. WITHDRAW Funds");
            System.out.println("3. DEPOSIT Funds");
            System.out.println("4. Go back");

            int option = InputUtility.getIntInput("? ");
            switch (option) {
                case 1:
                    out = BANK_OP.TRANSFER_FUNDS;
                    break;
                case 2:
                    out = BANK_OP.WITHDRAW_FUNDS;
                    break;
                case 3:
                    out = BANK_OP.DEPOSIT_FUNDS;
                    break;
                case 4:
                    return null;
                default:
                    System.out.println("Error: expected 1-4");
            }
        } while (out == null);

        return out;
    }

    // REPL for customer ops 
    private static BANK_OP customerReplHelper() {
        BANK_OP out = null;
        do {
            System.out.println("1. CREATE Customer");
            System.out.println("2. UPDATE Customer");
            System.out.println("3. READ Customer");
            System.out.println("4. DELETE Customer");
            System.out.println("5. LIST Customers");
            System.out.println("6. Go back");

            int option = InputUtility.getIntInput("? ");
            switch (option) {
                case 1:
                    out = BANK_OP.CREATE_CUSTOMER;
                    break;
                case 2:
                    out = BANK_OP.UPDATE_CUSTOMER;
                    break;
                case 3:
                    out = BANK_OP.READ_CUSTOMER;
                    break;
                case 4:
                    out = BANK_OP.DELETE_CUSTOMER;
                    break;
                case 5:
                    out = BANK_OP.LIST_CUSTOMERS;
                    break;
                case 6:
                    return null;
                default:
                    System.out.println("Error: expected 1-6");
            }
        } while (out == null);

        return out;
    }

    public static BANK_OP replHelper() {
        BANK_OP out = null;

        do {
            System.out.println("1. Account Ops");
            System.out.println("2. Manage Funds");
            System.out.println("3. Customedr Ops");

            int op1 = InputUtility.getIntInput("? ");
            switch(op1) {
                case 1:
                    // handle bank account CRUD operations
                    out = accountReplHelper();
                    break;
                case 2:
                    // handle fund management operations (transfer, dep, withdraw)
                    out = fundsReplHelper();
                    break;
                case 3:
                    // Handle customer CRUD operations
                    out = customerReplHelper();
                    break;
                default:
                    System.out.println("Error: choice needs to be between 1-3");
            }
        } while(out == null);

        return out;
    }

    public static void main(String[] args) {
        while(true){
            // Deduce banking operation without resolving
            BANK_OP op = replHelper();

            System.out.println("\n" + op.name());
        }
    }
}

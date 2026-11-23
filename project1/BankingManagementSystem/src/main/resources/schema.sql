CREATE DATABASE IF NOT EXISTS banking;
USE banking;

CREATE TABLE IF NOT EXISTS customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    email       VARCHAR(100) UNIQUE,
    phone       VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS account (
    account_number VARCHAR(20) PRIMARY KEY,
    customer_id    INT NOT NULL,
    account_type   ENUM('SAVINGS','CURRENT') NOT NULL,
    balance        DECIMAL(15,2) NOT NULL DEFAULT 0,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

CREATE TABLE IF NOT EXISTS transaction (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    account_number VARCHAR(20) NOT NULL,
    type           ENUM('DEPOSIT','WITHDRAW','TRANSFER') NOT NULL,
    amount         DECIMAL(15,2) NOT NULL,
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (account_number) REFERENCES account(account_number)
);

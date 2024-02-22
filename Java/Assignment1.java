package com.edu.MavTest;

import java.util.Random;

class Account {
    private String accountId;
    private String accountName;
    private double balance;
    private Loan loan;

    public Account(String accountId, String accountName, double initialBalance, Loan loan) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = initialBalance;
        this.loan = loan;
    }

    public double getBalance() {
        return balance;
    }

    public void displayDetails() {
        System.out.printf("Account ID: %s, Account Name: %s, Balance: $%.2f%n", accountId, accountName, balance);
        if (loan != null) {
            loan.displayLoan();
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited: $%.2f%n", amount);
        System.out.printf("Current Balance: $%.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawn: $%.2f%n", amount);
            System.out.printf("Current Balance: $%.2f%n", balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

class Loan {
    private String loanId;
    private String loanType;
    private double loanAmount;

    public Loan(String loanId, String loanType, double loanAmount) {
        this.loanId = loanId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public void displayLoan() {
        System.out.printf("Loan ID: %s, Loan Type: %s, Loan Amount: $%.2f%n", loanId, loanType, loanAmount);
    }
}

public class Assignment1 {

    public static void main(String[] args) {
        Random random = new Random();
        Account[] accounts = new Account[10];

        for (int i = 0; i < 10; i++) {
            String accountId = generateAccountId(random);
            String accountName = "Account " + i;
            double initialBalance = random.nextDouble() * 1000;
            String loanType = random.nextBoolean() ? "home" : "car";
            double loanAmount = random.nextDouble() * 100000;

            Loan loan = new Loan(generateAccountId(random), loanType, loanAmount);
            Account account = new Account(accountId, accountName, initialBalance, loan);
            accounts[i] = account;

            account.displayDetails();

            double depositAmount = random.nextDouble() * 1000;
            account.deposit(depositAmount);

            double withdrawalAmount = random.nextDouble() * account.getBalance();
            account.withdraw(withdrawalAmount);

            System.out.println();
        }
    }

    public static String generateAccountId(Random random) {
        StringBuilder accountIdBuilder = new StringBuilder();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 7; i++) {
            accountIdBuilder.append(random.nextInt(10));
        }
        for (int i = 0; i < 4; i++) {
            accountIdBuilder.append(chars.charAt(random.nextInt(chars.length())));
        }
        return accountIdBuilder.toString();
    }
}

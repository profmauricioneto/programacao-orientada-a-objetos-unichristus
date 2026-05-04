/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unichristus.unidade4.solid_examples.goodexamples;

/**
 *
 * @author maumneto
 */
class AccountLSP {
    private double balance;
    public AccountLSP() {
        this.balance = 0;
    }
    public AccountLSP(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) { this.balance = balance; }
    public void withdraw(double value) {
        if (balance >= value) {
            this.balance = this.balance - value;
        } else {
            System.out.println("No enough funds");
        }
    }
    public void deposit(double value) {
        this.balance = this.balance + value;
    }
    public void income() {
        this.balance = this.balance*1.005;
    }
}

class AccountSpecial {
    private AccountLSP account;
    public AccountSpecial() {
        account = new AccountLSP();
    }
    public AccountSpecial(double balance) {
        account = new AccountLSP(balance);
    }
    public double getBalance() {
        return account.getBalance();
    }
    public void withdraw(double value) {
        account.withdraw(value);
    }
    public void deposit(double value) {
        account.deposit(value);
    }

    public void income() {
        System.out.println("Não há rendimento em conta especial");
    }
}

class SavingAccount {
    private AccountLSP account;
    private double balance;

    public SavingAccount() {
        account = new AccountLSP();
    }
    public SavingAccount(double balance) {
        account = new AccountLSP(balance);
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void withdraw(double value) {
        account.withdraw(value);
    }

    public void deposit(double value) {
        account.deposit(value);
    }

    public void income() {
        balance = getBalance();
        balance += balance*1.1;
        account.setBalance(balance);
    }
}

public class GoodLSPExample {
    public static void main(String[] args) {
        AccountSpecial account = new AccountSpecial(500);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(100);
        System.out.println("New Balance: " + account.getBalance());
    }
}

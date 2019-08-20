package org.academiadecodigo.bankwallet;

public class Bank {

    private double balance;

    public Bank(double balance){
        this.balance = balance;
    }

    public void cashDeposit(double value){
        balance = balance + value;
    }

    public boolean cashOut(double value){

        if (value > balance){
            System.out.println("Sorry, you don't have money in your account :(");
            return false;
        }

        balance = balance - value;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

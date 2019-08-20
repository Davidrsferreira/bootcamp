package org.academiadecodigo.bankwallet;

public class Wallet {

    private double balance;

    public Wallet(double balance){
        this.balance = balance;
    }

    public void cashDeposit(double value){
        balance = balance + value;
    }

    public boolean cashOut(double value){

        if (value > balance){
            System.out.println("Sorry, you don't have money in your wallet :(");
            return false;
        }

        balance = balance - value;
        return true;
    }

    public boolean spend(double value){
        return cashOut(value);
    }

    public double getBalance() {
        return balance;
    }
}
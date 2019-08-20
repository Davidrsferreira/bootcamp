package org.academiadecodigo.bankwallet;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(1000.0);
        Wallet wallet = new Wallet(120.0);
        Owner owner = new Owner("David Ferreira", bank, wallet);

        System.out.println("Value in bank: 1000.00");
        System.out.println("Value in wallet: 120.00");

        System.out.println("##################");
        System.out.println("Cash out of 300.00");
        owner.cashOutBank(300.0);
        System.out.println("Bank: " + owner.getBankBalance());
        System.out.println("Wallet: " + owner.getWalletBalance());

        System.out.println("##################");
        System.out.println("Cash out of 400.00");
        owner.cashOutBank(400.0);
        System.out.println("Bank: " + owner.getBankBalance());
        System.out.println("Wallet: " + owner.getWalletBalance());

        System.out.println("##################");
        System.out.println("Deposit of 400.00");
        owner.cashDepositBank(400.0);
        System.out.println("Bank: " + owner.getBankBalance());
        System.out.println("Wallet " + owner.getWalletBalance());

        System.out.println("##################");
        System.out.println("Cash out of 900.00");
        owner.cashOutBank(900.0);
        System.out.println("Bank: " + owner.getBankBalance());
        System.out.println("Wallet: " + owner.getWalletBalance());
    }
}

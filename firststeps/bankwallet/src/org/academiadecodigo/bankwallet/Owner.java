package org.academiadecodigo.bankwallet;

public class Owner {

    private String name;
    private Bank bank;
    private Wallet wallet;

    public Owner(String name, Bank bank, Wallet wallet){
        this.name = name;
        this.bank = bank;
        this.wallet = wallet;
    }

    public void cashDepositBank(double value){

        if (!wallet.cashOut(value)){
            return;
        }

        bank.cashDeposit(value);
    }

    public void cashOutBank(double value){

        if (!bank.cashOut(value)){
            return;
        }

        wallet.cashDeposit(value);
    }

    public String getName() {
        return name;
    }

    public double getBankBalance(){
        return bank.getBalance();
    }

    public double getWalletBalance(){
        return wallet.getBalance();
    }
}

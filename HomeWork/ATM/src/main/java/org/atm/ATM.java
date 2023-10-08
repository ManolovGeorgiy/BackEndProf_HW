package org.atm;

public abstract class ATM {
    private String bankName;
    private double balanceUSD;

    public ATM(String bankName, double balanceUSD) {
        this.bankName = bankName;
        this.balanceUSD = balanceUSD;
    }

    public String getBankName() {
        return this.bankName;
    }

    public double getBalanceUSD() {
        return this.balanceUSD;
    }

    public void withdraw(CreditCard card, double amountUSD) {
    }

    public void deposit(CreditCard card, double amountUSD) {
    }

    public boolean checkPin(CreditCard card, int pin) {
        return card.getPin() == pin;
    }

    public abstract double convert(double var1);
}

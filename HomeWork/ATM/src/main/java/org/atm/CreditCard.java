package org.atm;

public class CreditCard {
    private String cardNumber;
    private int pin;
    private double balanceEUR;
    public CreditCard(String cardNumber, int pin, double balanceEUR) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balanceEUR = balanceEUR;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }
    public int getPin() {
        return this.pin;
    }
    public double getBalanceEUR() {
        return this.balanceEUR;
    }
    public void deductBalanceEUR(double amountEUR) {
        this.balanceEUR -= amountEUR;
    }
    public void addBalanceEUR(double amountEUR) {
        this.balanceEUR += amountEUR;
    }
}

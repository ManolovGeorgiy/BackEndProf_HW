package org.atm;

public class SimpleATM extends ATM implements Converter {
    public SimpleATM(String bankName, double balanceUSD) {
        super(bankName, balanceUSD);
    }
    public void withdraw(CreditCard card, double amountUSD) {
        if (this.getBalanceUSD() >= amountUSD) {
            super.withdraw(card, amountUSD);
            System.out.println("Снято " + amountUSD + " USD с вашей карты.");
        } else {
            System.out.println("Недостаточно средств в банкомате.");
        }
    }
    public void deposit(CreditCard card, double amountUSD) {
        super.deposit(card, amountUSD);
        System.out.println("Внесено " + amountUSD + " USD на карту.");
    }
    public double convert(double amountEUR) {
        return 0.0;
    }
}

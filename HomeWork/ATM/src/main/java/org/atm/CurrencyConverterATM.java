package org.atm;

public class CurrencyConverterATM extends ATM implements Converter {
    public CurrencyConverterATM(String bankName, double balanceUSD) {
        super(bankName, balanceUSD);
    }
    public void withdraw(CreditCard card, double amountUSD) {
        if (this.getBalanceUSD() >= amountUSD) {
            card.deductBalanceEUR(amountUSD / this.convert(1.0));
            super.withdraw(card, amountUSD);
            System.out.println("Снято " + amountUSD + " USD с карты.");
        } else {
            System.out.println("Недостаточно средств на банкомате.");
        }

    }
    public void deposit(CreditCard card, double amountUSD) {
        card.addBalanceEUR(amountUSD / this.convert(1.0));
        super.deposit(card, amountUSD);
        System.out.println("Внесено " + amountUSD + " USD на карту.");
    }
    public double convert(double amountInEUR) {
        return amountInEUR * 1.06;
    }
}


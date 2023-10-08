package org.atm;

import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {

        ATM[] atms = new ATM[4];
        atms[0] = new SimpleATM("Commerz Bank", 4000);
        atms[1] = new SimpleATM("Deutsche Bank", 1000);
        atms[2] = new SimpleATM("Advanzia Bank", 0);
        atms[3] = new CurrencyConverterATM("Bank Berliner Sparkasse", 10000);

        CreditCard card = new CreditCard("5489-0023-0441-2178",3320, 5200);

        Scanner scanner = new Scanner(System.in);
        int enteredPin;

        for (ATM atm : atms) {
            System.out.println("Попытка авторизации в банкомате " + atm.getBankName());
            System.out.print("Введите PIN: ");
            enteredPin = scanner.nextInt();

            if (atm.checkPin(card, enteredPin)) {
                System.out.println("Авторизация успешна!");
                System.out.print("Введите сумму для снятия в EUR: ");
                double amountEUR = scanner.nextDouble();

                double amountUSD = atm.convert(amountEUR);
                atm.withdraw(card, amountUSD);

                System.out.println("Информация о карте:");
                System.out.println("Номер карты: " + card.getCardNumber());
                System.out.println("Баланс на карте : " + card.getBalanceEUR() + "(EUR)");

                System.out.println("Информация о банкомате " + atm.getBankName() + ":");
                System.out.println("Сумма в банкомате : " + atm.getBalanceUSD() + "(USD)");
                System.out.println();
            } else {
                System.out.println("Авторизация не удалась. Неверный PIN.");
            }
        }
    }
}


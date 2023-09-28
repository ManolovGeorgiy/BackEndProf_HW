package org.phone;

public class HomeWorkOne {

    public static void main (String[] args){

        Phone phone1 = new Phone("+3235678943", "iPhone", 0.5);
        Phone phone2 = new Phone("+491573107895", "Samsung", 0.6);
        Phone phone3 = new Phone("+38024653213", "LG", 0.4);

        // Вывод значений через геттеры
        System.out.println("Phone 1: Number = " + phone1.getNumber() + ", Model = " + phone1.getModel() + ", Weight = " + phone1.getWeight());
        System.out.println("Phone 2: Number = " + phone2.getNumber() + ", Model = " + phone2.getModel() + ", Weight = " + phone2.getWeight());
        System.out.println("Phone 3: Number = " + phone3.getNumber() + ", Model = " + phone3.getModel() + ", Weight = " + phone3.getWeight());


        phone1.receiveCall("Georgiy");
        phone2.receiveCall("Anna");
        phone3.receiveCall("Maria");
    }
}
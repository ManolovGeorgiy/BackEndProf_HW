package com.telran.org.homeworktwo.phone;

public class PhoneMain {
    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone("ButtonPhone", "3");
        SmartPhone smartPhone = new SmartPhone("SmartPhone", "2");
        RadioPhone radioPhone = new RadioPhone("RadioPhone", "1");

        buttonPhone.call("+38099876543");
        smartPhone.call("+491574352111");
        radioPhone.call("+12398653434");

        buttonPhone.receiveCall("+3805667765");
        smartPhone.receiveCall("+491534435456");
        radioPhone.receiveCall("+435675632432");


        makeCall(buttonPhone, "+49187893434");
        makeCall(smartPhone, "+35876342234");
        makeCall(radioPhone, "+780452239865");
    }

    public static void makeCall(Phone phone, String phoneNumber) {
        phone.call(phoneNumber);
    }

    public static void receiveCall(Phone phone, String phoneNumber) {
        phone.receiveCall(phoneNumber);
    }
}
package com.telran.org.homeworktwo.phone;
class SmartPhone extends Phone {
    public SmartPhone(String phoneName, String ownNumber) {
        super(phoneName, ownNumber);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to make a call to number " + phoneNumber);
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to receive a call from number " + phoneNumber);
    }
}

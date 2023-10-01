package com.telran.org.homeworktwo.phone;

public class Phone {
    private String phoneName;
    private String ownNumber;

    public Phone(String phoneName, String ownNumber) {
        this.phoneName = phoneName;
        this.ownNumber = ownNumber;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call(String phoneNumber) {
        System.out.println("The phone " + phoneName + " " + ownNumber + " try to make a call to number " + phoneNumber);
    }

    public void receiveCall(String phoneNumber) {
        System.out.println("The phone " + phoneName + " " + ownNumber + " try to receive a call from number " + phoneNumber);
    }
}




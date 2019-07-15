package com.tws.refactoring;

public class Driver {

    public static final int LEGAL_AGE = 18;

    public int age;

    public Driver() {

    }


    public boolean isLegalDriver() {
        return this.age >= LEGAL_AGE;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

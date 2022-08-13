package com.company;

public class Main {

    static {
        System.loadLibrary("/c/Users/KTJ/Desktop/JniTest/src/com/company/TEST1111");
    }

    private native int getNumber();
    private native void printHelloWord();

    public static void main(String[] args) {


    }
}

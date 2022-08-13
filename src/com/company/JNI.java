package com.company;

public class JNI {
    static {
        System.loadLibrary("TEST1111");
    }

    private native int getNumber(int num);
    private native void printHelloWord();

    private int getResult( ) {
        System.out.println("[java function] getResult Call !");
        return 10;
}

    public static void main(String[] args) {

        JNI jni = new JNI();

        jni.printHelloWord();

        //System.out.println(jni.getNumber(20));
    }
}

// https://mommoo.tistory.com/71
// https://m.blog.naver.com/sssang97/221737572369
// javac -h . JNI.java
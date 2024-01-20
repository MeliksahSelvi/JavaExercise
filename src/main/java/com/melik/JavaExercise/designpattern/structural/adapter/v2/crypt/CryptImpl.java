package com.melik.JavaExercise.designpattern.structural.adapter.v2.crypt;

public class CryptImpl implements Crypt {
    @Override
    public void encrypt(String text) {
        System.out.println("#encrypt ->" + text);
    }

    @Override
    public void decrypt(String text) {
        System.out.println("#decrypt ->" + text);
    }
}

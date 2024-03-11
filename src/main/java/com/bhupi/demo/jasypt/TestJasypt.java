package com.bhupi.demo.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

public class TestJasypt {

    public static void main(String[] args) {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setPassword("DEMO_PASSWORD");
        standardPBEStringEncryptor.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        standardPBEStringEncryptor.setIvGenerator(new RandomIvGenerator());
        String encryptedValue = standardPBEStringEncryptor.encrypt("Test");
        System.out.println("Encrypted Value: "+encryptedValue);
        System.out.println(standardPBEStringEncryptor.decrypt(encryptedValue));
    }
}

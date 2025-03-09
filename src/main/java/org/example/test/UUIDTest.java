package org.example.test;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString();
        System.out.println(s);
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
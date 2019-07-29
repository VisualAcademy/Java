package com.devlec;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int r = rnd.nextInt(10) + 1; // 1 ~ 10
        System.out.println(r);

        System.out.println(rnd.nextBoolean()); // true, false
        System.out.println(rnd.nextDouble()); // 0.0~1.0
        System.out.println(rnd.nextInt()); // int 전체 범위
    }
}

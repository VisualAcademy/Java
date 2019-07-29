// 3명의 학생의 점수를 입력받아 총점을 구하는 프로그램
//package com.devlec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] students = new int[3];
        Scanner scanner = new Scanner(System.in);
        students[0] = scanner.nextInt();
        students[1] = scanner.nextInt();
        students[2] = scanner.nextInt();
        int total = students[0] + students[1] + students[2];
        System.out.println("총점: " + total);
    }
}

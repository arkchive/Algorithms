package Baekjoon.Bronze.B_1075;

import java.util.Scanner;

public class B2_1075_나누기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int F = scan.nextInt();

        int rest = N % 100;
        N -= rest;
        boolean correct = false;
        
        while (!correct) {
            if (N % F == 0) {
                correct = true;
                break;
            } else {
                N++;
            }
        }

        int result = N % 100;
        System.out.printf("%02d", result);
    }
}

package Baekjoon.Bronze.B_2438;

import java.util.Scanner;

public class B5_2438_별_찍기_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("*".repeat(i+1));
        }
        scan.close();
    }
}

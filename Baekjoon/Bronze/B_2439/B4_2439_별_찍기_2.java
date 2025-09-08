package Baekjoon.Bronze.B_2439;

import java.util.Scanner;

public class B4_2439_별_찍기_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(" ".repeat(N-i-1) + "*".repeat(i+1));
        }
        scan.close();
    }
}

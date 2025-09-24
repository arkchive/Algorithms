package Baekjoon.Bronze.B_11050;

import java.util.Scanner;

public class B_11050_이항_계수_1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int num = 1;
        int den = 1;
        for (int i = 1; i <= K; i++) {
            num *= (N - i + 1);
            den *= i;
        }
        System.out.println(num / den);
    }
    
}

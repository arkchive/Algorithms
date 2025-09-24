package Baekjoon.Bronze.B_11050;

import java.util.Scanner;

public class B_11050_이항_계수_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int result = factorial(N) / (factorial(K) * factorial(N-K));
        System.out.println(result);
    }

    static int factorial(int n) {
        if (n == 0 | n == 1) return 1;
        return n * factorial(n-1);
    }
    
}

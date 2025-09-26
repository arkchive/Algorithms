package Baekjoon.Bronze.B_10870;

import java.util.Scanner;

public class B2_10870_피보나치_수_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(fibonacci(N));
    }

    static int fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fibonacci(N-1) + fibonacci(N-2);
    }
    
}

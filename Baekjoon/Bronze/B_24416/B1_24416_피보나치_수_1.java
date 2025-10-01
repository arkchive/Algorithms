package Baekjoon.Bronze.B_24416;

import java.util.Scanner;

public class B1_24416_피보나치_수_1 {

    static int cnt1, cnt2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        fib(n);
        fibonacci(n);

        System.out.println(cnt1 + " " + cnt2);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        }
        else return (fib(n-1) + fib(n-2));
    }
    
    static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;

        int[] f = new int[n+1];

        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
            cnt2++;
        }
        return f[n];
    }
}

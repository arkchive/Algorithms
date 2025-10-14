package Baekjoon.Bronze.B_2609;

import java.util.Scanner;

public class B1_2609_최대공약수와_최소공배수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        System.out.println(gcd(A, B));
        System.out.println(lcm(A, B));
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

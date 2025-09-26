package Baekjoon.Bronze.B_27433;

import java.util.Scanner;

public class B5_27433_팩토리얼_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(factorial(N));
    }

    static long factorial(int N) {
        if (N == 0) return 1;
        return N * factorial(N-1);
    }
    
}

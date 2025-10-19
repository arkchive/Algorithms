package Baekjoon.Bronze.B_1110;

import java.util.Scanner;

public class B1_1110_더하기_사이클 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        if (N < 10) N *= 10;
        int original = N;

        do {
            int add = (N / 10) + (N % 10);
            N = (N % 10) * 10 + (add % 10);
            cnt += 1;
        } while(N != original);
        
        System.out.println(cnt);
    }
}

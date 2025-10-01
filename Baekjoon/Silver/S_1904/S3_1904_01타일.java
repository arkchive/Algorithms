package Baekjoon.Silver.S_1904;

import java.util.Scanner;

public class S3_1904_01타일 {

    static int MOD = 15746;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if (N == 1) { System.out.println(1); return; }
        if (N == 2) { System.out.println(2); return; }

        int a = 1;
        int b = 2;
        int cur = 0;

        for (int i = 3; i <= N; i++) {
            cur = (a + b) % MOD;
            a = b;
            b = cur;
        }
        System.out.println(cur);        
    }
    
}

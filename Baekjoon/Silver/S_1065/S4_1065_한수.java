package Baekjoon.Silver.S_1065;

import java.util.Scanner;

public class S4_1065_한수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                cnt++;
            } else {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;
                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

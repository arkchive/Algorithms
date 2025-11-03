package Baekjoon.Silver.S_2960;

import java.util.Scanner;

public class S4_2960_에라토스테네스의_체 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int cnt = 0;
        boolean[] removed = new boolean[N+1];
        
        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                if (!removed[j]) {
                    removed[j] = true;
                    cnt++;
                    if (cnt == K) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}

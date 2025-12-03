package Baekjoon.Silver.S_2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_2156_포도주_시식 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufRead.readLine());
        int[] wine = new int[n+1];
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(bufRead.readLine());
        }

        dp[1] = wine[1];
        
        if (n >= 2) {
            dp[2] = wine[1] + wine[2];
        }
        /*
        dp[i]를 구성하는 3가지 경우 (연속으로 3잔을 마실 수 없다.)
        1. i번째 잔을 안 마신다.
        2. i번째 잔은 마시지만 i-1번째 잔은 안 마신다.
        3. i번째와 i-1번째 잔은 마시고, i-2번째는 안 마신다.
        */
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wine[i], dp[i-3] + wine[i-1] + wine[i]));
        }
        System.out.println(dp[n]);
    }
}

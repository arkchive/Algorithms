package Baekjoon.Silver.S_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_14501_퇴사 {
    static int[] T;
    static int[] P;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        int N = Integer.parseInt(bufRead.readLine());

        T = new int[N+1];
        P = new int[N+1];
        dp = new int[N+2];

        for (int i = 1; i <= N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            T[i] = Integer.parseInt(strToken.nextToken());
            P[i] = Integer.parseInt(strToken.nextToken());
        }

        for (int i = N; i >= 1; i--) {
            int next = i + T[i];

            if (next <= N + 1) {
                dp[i] = Math.max(dp[i + 1], P[i] + dp[next]);
            } else {
                dp[i] = dp[i + 1];
            }
        }
        System.out.println(dp[1]);
    }
}

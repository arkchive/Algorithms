package Baekjoon.Silver.S_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_9095_123_더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        int T = Integer.parseInt(bufRead.readLine());
        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(bufRead.readLine());
            strBuild.append(dp[n]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
}

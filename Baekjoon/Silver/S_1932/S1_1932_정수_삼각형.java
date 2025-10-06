package Baekjoon.Silver.S_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1932_정수_삼각형 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int n = Integer.parseInt(bufRead.readLine());
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < i+1; j++) {
                triangle[i][j] = Integer.parseInt(strToken.nextToken());
            }
        }

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + triangle[i][0];

            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
            }
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
        }

        for (int i = 0; i < n; i++) {
            if (dp[n-1][i] > max) max = dp[n-1][i];
        }
        System.out.println(max);
    }
    
}

package Baekjoon.Silver.S_1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_1912_연속합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufRead.readLine());
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strToken.nextToken());
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        int max = dp[0];
        
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
    
}

package Baekjoon.Silver.S_9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_9184_신나는_함수_실행 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken;

        int dp[][][] = new int[21][21][21];

        for (int a = 0; a <= 20; a++) {
            for (int b = 0; b <= 20; b++) {
                for (int c = 0; c <= 20; c++) {
                    if (a == 0 || b == 0 || c == 0) {
                        dp[a][b][c] = 1;
                    } else if (a < b && b < c) {
                        dp[a][b][c] = dp[a][b][c-1]
                                    + dp[a][b-1][c-1]
                                    - dp[a][b-1][c];
                    } else {
                        dp[a][b][c] = dp[a-1][b][c]
                                    + dp[a-1][b-1][c]
                                    + dp[a-1][b][c-1]
                                    - dp[a-1][b-1][c-1];
                    }
                }
            }
        }

        while(true) {
            strToken = new StringTokenizer(bufRead.readLine());
            int a = Integer.parseInt(strToken.nextToken());
            int b = Integer.parseInt(strToken.nextToken());
            int c = Integer.parseInt(strToken.nextToken());
            
            if (a == -1 && b == -1 && c == -1) break;

            int answer;
            if (a <= 0 || b <= 0 || c <= 0) answer = 1;
            else if (a > 20 || b > 20 || c > 20) answer = dp[20][20][20];
            else answer = dp[a][b][c];

            strBuild.append(String.format("w(%d, %d, %d) = %d\n", a, b, c, answer));
        }
        System.out.println(strBuild.toString());
    }
}

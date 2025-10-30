package Baekjoon.Silver.S_11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_11660_구간_합_구하기_5 {

    static int N, M;
    static int x1, x2, y1, y2;
    static int[][] A;
    static long[][] S;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        N = Integer.parseInt(strToken.nextToken());
        M = Integer.parseInt(strToken.nextToken());
        A = new int[N+1][N+1];

        for (int i = 1 ; i <= N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(strToken.nextToken());
            }
        }
        
        S = new long[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            long rowPrefix = 0;
            for (int j = 1; j <= N; j++) {
                rowPrefix += A[i][j];
                S[i][j] = S[i-1][j] + rowPrefix;
            }
        }

        for (int i = 0; i < M; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            x1 = Integer.parseInt(strToken.nextToken());
            y1 = Integer.parseInt(strToken.nextToken());
            x2 = Integer.parseInt(strToken.nextToken());
            y2 = Integer.parseInt(strToken.nextToken());

            long sum = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
            strBuild.append(sum).append('\n');
        }
        System.out.println(strBuild.toString());
    }
}

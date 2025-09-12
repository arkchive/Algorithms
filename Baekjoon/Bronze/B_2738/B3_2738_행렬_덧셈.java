package Baekjoon.Bronze.B_2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2738_행렬_덧셈 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());
        int[][] matrixA = new int[N][M];
        int[][] matrixB = new int[N][M];

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = Integer.parseInt(strToken.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < M; j++) {
                matrixB[i][j] = Integer.parseInt(strToken.nextToken());
                int sum = matrixA[i][j] + matrixB[i][j];
                strBuild.append(sum).append(" ");
            }
            strBuild.append("\n");
        }

        System.out.println(strBuild.toString());
    }
    
}

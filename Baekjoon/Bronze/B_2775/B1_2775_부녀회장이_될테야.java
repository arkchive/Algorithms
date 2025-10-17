package Baekjoon.Bronze.B_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_2775_부녀회장이_될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());
        int[][] a = new int[15][15];

        for (int n = 1; n < 15; n++) {
            a[0][n] = n;
        }
        for (int k = 1; k < 15; k++) {
            a[k][1] = 1;
            for (int n = 2; n < 15; n++) {
                a[k][n] = a[k-1][n] + a[k][n-1];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(bufRead.readLine());
            int n = Integer.parseInt(bufRead.readLine());
            strBuild.append(a[k][n]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
}

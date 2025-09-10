package Baekjoon.Bronze.B_10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_10871_X보다_작은_수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int X = Integer.parseInt(strToken.nextToken());

        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(strToken.nextToken());
            if (A < X) {
                strBuild.append(A).append(" ");
            }
        }

        System.out.println(strBuild.toString().trim());
    }

}

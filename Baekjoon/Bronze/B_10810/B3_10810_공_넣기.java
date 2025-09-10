package Baekjoon.Bronze.B_10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10810_공_넣기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        int[] arr = new int[N+1];

        for (int a = 0; a < M; a++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int i = Integer.parseInt(strToken.nextToken());
            int j = Integer.parseInt(strToken.nextToken());
            int k = Integer.parseInt(strToken.nextToken());

            for (int b = i; b <= j; b++) {
                arr[b] = k;
            }
        }
        for (int i = 1; i < N+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}

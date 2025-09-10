package Baekjoon.Bronze.B_10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_10813_공_바꾸기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        int[] arr = new int[N+1];
        for (int l = 1; l < N+1; l++) {
            arr[l] = l;
        }
        for (int k = 0; k < M; k++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int i = Integer.parseInt(strToken.nextToken());
            int j = Integer.parseInt(strToken.nextToken());

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int m = 1; m < N+1; m++) {
            System.out.print(arr[m] + " ");
        }
    }
}

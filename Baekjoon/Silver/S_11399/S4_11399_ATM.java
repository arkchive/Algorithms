package Baekjoon.Silver.S_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());
        int[] arr = new int[N];
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strToken.nextToken());
        }

        Arrays.sort(arr);

        int sum = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            total += sum;
        }
        System.out.println(total);
    }
}

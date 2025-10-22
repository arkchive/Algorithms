package Baekjoon.Silver.S_1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_1026_보물 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());

        int[] A = new int[N];
        Integer[] B = new Integer[N];
        Integer[] idx = new Integer[N];
        int[] newA = new int[N];
        int S = 0;

        for (int i = 0; i < N; i++) {
            idx[i] = i;
        }

        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strToken.nextToken());
        }

        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(strToken.nextToken());
        }

        Arrays.sort(A);
        
        Arrays.sort(idx, (i, j) -> B[j] - B[i]);

        for (int i = 0; i < N; i++) {
            newA[idx[i]] = A[i];
        }

        for (int i = 0; i < N; i++) {
            S += newA[i] * B[i];
        }

        System.out.println(S);
    }
}
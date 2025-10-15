package Baekjoon.Silver.S_1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S4_1015_수열_정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());
        int[][] arr = new int[N][2];
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(strToken.nextToken());
            arr[i][0] = A;
            arr[i][1] = i;
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        int[] P = new int[N];
        for (int i = 0; i < N; i ++) {
            int originalIndex = arr[i][1];
            P[originalIndex] = i;
        }

        for (int i : P) {
            strBuild.append(i).append(" ");
        }
        System.out.println(strBuild.toString());
    }
}

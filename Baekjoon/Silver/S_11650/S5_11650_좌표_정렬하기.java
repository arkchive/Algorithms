package Baekjoon.Silver.S_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_11650_좌표_정렬하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());
        int[][] arrs = new int[N][2];

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            arrs[i][0] = Integer.parseInt(strToken.nextToken());
            arrs[i][1] = Integer.parseInt(strToken.nextToken());
        }

        Arrays.sort(arrs, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < N; i++) {
            strBuild.append(arrs[i][0]).append(" ").append(arrs[i][1]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

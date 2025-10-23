package Baekjoon.Silver.S_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_11659_구간_합_구하기_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        int[] nums = new int[N];
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(strToken.nextToken());
        }
        
        int[] prefix = new int[N+1];
        for (int i = 1; i < N + 1; i++) {
            prefix[i] = prefix[i-1] + nums[i-1];
        }

        for (int k = 0; k < M; k++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int i = Integer.parseInt(strToken.nextToken());
            int j = Integer.parseInt(strToken.nextToken());

            int sum = prefix[j] - prefix[i-1];
            strBuild.append(sum).append("\n");
        }
        System.out.println(strBuild.toString());
    }
}
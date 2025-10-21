package Baekjoon.Silver.S_15665;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_15665_N과_M_11 {
    
    static int N, M;
    static int[] arr, nums;
    static StringBuilder strBuild = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        N = Integer.parseInt(strToken.nextToken());
        M = Integer.parseInt(strToken.nextToken());

        arr = new int[M];
        nums = new int[N];

        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0 ; i < N; i++) {
            nums[i] = Integer.parseInt(strToken.nextToken());
        }

        Arrays.sort(nums);
        dfs(0);
        System.out.println(strBuild.toString());
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int i : arr) {
                strBuild.append(i).append(" ");
            }
            strBuild.append("\n");
            return;
        }

        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (nums[i] == prev) continue;
            arr[depth] = nums[i];
            prev = nums[i];
            dfs(depth + 1);
        }
    }
}

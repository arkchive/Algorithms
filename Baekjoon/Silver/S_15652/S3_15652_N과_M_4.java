package Baekjoon.Silver.S_15652;

import java.util.Scanner;

public class S3_15652_N과_M_4 {

    static int N, M;
    static int[] arr;
    static StringBuilder strBuild = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();

        arr = new int[M];
        backtrack(0, 1);
        System.out.println(strBuild.toString());
    }

    static void backtrack(int depth, int start) {
        if (depth == M) {
            for (int i : arr) {
                strBuild.append(i).append(" ");
            }
            strBuild.append("\n");
            return;
        }
        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            backtrack(depth + 1, i);
        }
    }
}

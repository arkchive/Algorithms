package Baekjoon.Silver.S_15649;

import java.util.Scanner;

public class S3_15649_N과_M_1 {
    
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder strBuild = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        N = scan.nextInt();
        M = scan.nextInt();

        visited = new boolean[N+1];
        arr = new int[M];

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

        for (int j = 1; j <= N; j++) {
            if (!visited[j]) {
                visited[j] = true;
                arr[depth] = j;
                dfs(depth + 1);
                visited[j] = false;
            }
        }
    }
}

package Baekjoon.Gold.G_2533;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class G3_2533_사회망_서비스 {
    static ArrayList<Integer>[] graph;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());
        graph = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        dp = new int[N+1][2];

        for (int i = 0; i < N-1; i++) {
            StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
            
            int u = Integer.parseInt(strToken.nextToken());
            int v = Integer.parseInt(strToken.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(1, 0);
        System.out.println(Math.min(dp[1][0], dp[1][1]));
        
    }

    private static void dfs(int node, int parent) {
        dp[node][1] = 1; // 내가 얼리어답터인 경우

        for (int next : graph[node]) {
            if (next == parent) continue;

            dfs(next, node);

            dp[node][0] += dp[next][1]; // 해당 노드가 얼리어답터가 아니면 자식은 무조건 얼리어답터
            dp[node][1] += Math.min(dp[next][0], dp[next][1]); // 해당 노드가 얼리어답터이면 자식은 자유
        }
    }
}

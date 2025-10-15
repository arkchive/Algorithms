package Baekjoon.Silver.S_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class S3_2606_바이러스 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());
        int M = Integer.parseInt(bufRead.readLine());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            strToken = new StringTokenizer(bufRead.readLine());

            int a = Integer.parseInt(strToken.nextToken());
            int b = Integer.parseInt(strToken.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[N + 1];
        cnt = 0;
        dfs(1);

        System.out.println(cnt - 1);
    }

    static void dfs(int start) {
        visited[start] = true;
        cnt++;

        for(int next : graph[start]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}

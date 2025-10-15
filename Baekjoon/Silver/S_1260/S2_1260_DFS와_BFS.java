package Baekjoon.Silver.S_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2_1260_DFS와_BFS {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder strBuild = new StringBuilder();

    
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());
        int V = Integer.parseInt(strToken.nextToken());

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
        dfs(V);
        strBuild.append("\n");

        visited = new boolean[N + 1];
        bfs(V);

        System.out.println(strBuild.toString());
    }

    static void dfs(int v) {
        visited[v] = true;
        strBuild.append(v).append(" ");

        for (int next : graph[v]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            strBuild.append(cur).append(" ");

            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }

    }
}

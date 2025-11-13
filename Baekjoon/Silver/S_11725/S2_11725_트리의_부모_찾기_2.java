package Baekjoon.Silver.S_11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2_11725_트리의_부모_찾기_2 {
    static int N;
    static ArrayList<Integer>[] graph;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N-1; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int a = Integer.parseInt(strToken.nextToken());
            int b = Integer.parseInt(strToken.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        bfs(1);
        for (int i = 2; i <= N; i++) {
            strBuild.append(parent[i]).append('\n');
        }
        System.out.println(strBuild.toString());
    }

    static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = node;
                    queue.add(next);
                }
            }
        }
    }
}

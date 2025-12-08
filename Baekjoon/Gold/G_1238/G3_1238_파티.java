package Baekjoon.Gold.G_1238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class G3_1238_파티 {

    static int N, M, X;
    static int max;
    static int[] distFromX, distToX;
    static List<List<Node>> graph = new ArrayList<>();
    static List<List<Node>> reverseGraph = new ArrayList<>();

    static class Node{
        int to, weight;
        public Node(int to, int weight) {
            this.to = to; // 목적지 정점
            this.weight = weight; // 걸리는 시간(간선 비용)
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        N = Integer.parseInt(strToken.nextToken());
        M = Integer.parseInt(strToken.nextToken());
        X = Integer.parseInt(strToken.nextToken());


        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
            reverseGraph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int start = Integer.parseInt(strToken.nextToken());
            int end = Integer.parseInt(strToken.nextToken());
            int T = Integer.parseInt(strToken.nextToken());

            graph.get(start).add(new Node(end, T));
            reverseGraph.get(end).add(new Node(start, T));
        }

        distFromX = dijkstra(X, graph, N);
        distToX = dijkstra(X, reverseGraph, N);

        max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, distFromX[i] + distToX[i]);
        }
        System.out.println(max);
    }

    static int[] dijkstra (int start, List<List<Node>> graph, int N) {
            PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
            int[] dist = new int[N + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (dist[cur.to] < cur.weight) continue;

            for (Node next : graph.get(cur.to)) {
                int cost = cur.weight + next.weight;
                
                if (cost < dist[next.to]) {
                    dist[next.to] = cost;
                    pq.offer(new Node(next.to, cost));
                }
            }
        }

        return dist;
    }
}

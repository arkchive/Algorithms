package Baekjoon.Gold.G_1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class G4_1753_최단경로 {

    static class Node implements Comparable<Node> {
        int v, cost;
        Node(int v, int cost) {
            this.v = v; // 도착 노드
            this.cost = cost; // 비용
        }
        public int compareTo(Node o) {
            return this.cost - o.cost; // 비용 오름차순
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        int V = Integer.parseInt(strToken.nextToken()); // 정점 수
        int E = Integer.parseInt(strToken.nextToken()); // 간선 수
        int K = Integer.parseInt(bufRead.readLine()); // 시작 정점

        // 1. 인접 리스트 생성
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        // 2. 간선 입력
        for (int i = 0; i < E; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int u = Integer.parseInt(strToken.nextToken());
            int v = Integer.parseInt(strToken.nextToken());
            int w = Integer.parseInt(strToken.nextToken());

            graph.get(u).add(new Node(v, w));
        }

        // 3. 최단 거리 배열
        int[] dist = new int[V+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K] = 0;

        // 4. 우선 순위 큐
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(K, 0));

        // 5. 다익스트라
        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.cost > dist[cur.v]) continue;

            for (Node next :  graph.get(cur.v)) {
                int nextCost = cur.cost + next.cost;

                if (nextCost < dist[next.v]) {
                    dist[next.v] = nextCost;
                    pq.offer(new Node(next.v, nextCost));
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) strBuild.append("INF\n");
            else strBuild.append(dist[i]).append('\n');
        }
        System.out.println(strBuild.toString());
    }
}

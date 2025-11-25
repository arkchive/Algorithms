package Baekjoon.Gold.G_10282;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class G4_10282_해킹 {
    static class Node {
        int to, time;
        Node(int to, int time) {
            this.to = to; // 도착 컴퓨터 번호
            this.time = time; // 감염되기까지 걸리는 시간
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;
        int T = Integer.parseInt(bufRead.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int n = Integer.parseInt(strToken.nextToken()); // 컴퓨터 개수 
            int d = Integer.parseInt(strToken.nextToken()); // 의존성 개수
            int c = Integer.parseInt(strToken.nextToken()); // 해킹당한 컴퓨터 번호

            // 1. 인접 리스트 생성
            List<List<Node>> graph = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                graph.add(new ArrayList<>());
            }

            // 2. 의존성 정보 입력
            for (int k = 0; k < d; k++) {
                strToken = new StringTokenizer(bufRead.readLine());
                int a = Integer.parseInt(strToken.nextToken());
                int b = Integer.parseInt(strToken.nextToken());
                int s = Integer.parseInt(strToken.nextToken());

                graph.get(b).add(new Node(a, s));
            }

            // 3. 최소 시간 배열
            int[] dist = new int[n + 1];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[c] = 0;

            // 4. 우선순위 큐
            PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.time - o2.time);
            pq.offer(new Node(c, 0));

            // 5. 다익스트라 알고리즘
            while(!pq.isEmpty()) {
                Node cur = pq.poll();

                if (cur.time > dist[cur.to]) continue;

                for (Node next : graph.get(cur.to)) {
                    int nextTime = cur.time + next.time;

                    if (nextTime < dist[next.to]) {
                        dist[next.to] = nextTime;
                        pq.offer(new Node(next.to, nextTime));
                    }
                }
            }

            int count = 0; // 감염된 컴퓨터 수 
            int maxTime = 0; // 가장 늦게 감염된 시간

            for (int l = 1; l <= n; l++) {
                if (dist[l] != Integer.MAX_VALUE) {
                    count++;
                    maxTime = Math.max(maxTime, dist[l]);
                }
            }
            strBuild.append(count).append(' ').append(maxTime).append('\n');
        }
        System.out.println(strBuild.toString());
    }
}

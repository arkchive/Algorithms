package Baekjoon.Silver.S_11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class S1_11286_절댓값_힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        
        int N = Integer.parseInt(bufRead.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) return a - b;
                return absA - absB;
            }
        );
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(bufRead.readLine());
            if (x != 0) {
                pq.add(x);
            } else {
                if (pq.isEmpty()) {
                    strBuild.append(0).append('\n');
                } else {
                    strBuild.append(pq.poll()).append('\n');
                }
            }
        }
        System.out.println(strBuild.toString());
    }
}

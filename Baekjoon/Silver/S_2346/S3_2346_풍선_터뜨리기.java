package Baekjoon.Silver.S_2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class S3_2346_풍선_터뜨리기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken;

        int N = Integer.parseInt(bufRead.readLine());
        strToken = new StringTokenizer(bufRead.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            int k = Integer.parseInt(strToken.nextToken());
            deque.add(new int[]{i, k});
        }

        int[] cur = deque.pollFirst();
        strBuild.append(cur[0]).append(" ");
        int k = cur[1];

        while (!deque.isEmpty()) {
            int size = deque.size();
            if (k > 0) {
                for (int i = 0; i < k - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < -k; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
            cur = deque.pollFirst();
            strBuild.append(cur[0]).append(" ");
            k = cur[1];
        }
        System.out.println(strBuild.toString());
    }    
}

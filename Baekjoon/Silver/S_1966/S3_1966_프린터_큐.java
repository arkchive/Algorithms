package Baekjoon.Silver.S_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class S3_1966_프린터_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;

        int T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int N = Integer.parseInt(strToken.nextToken());
            int M = Integer.parseInt(strToken.nextToken());

            Queue<int[]> queue = new ArrayDeque<>();
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < N; j++) {
                int priority = Integer.parseInt(strToken.nextToken());
                queue.add(new int[]{j, priority});
            }

            int printCount = 0;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                boolean hasHigher = false;

                for (int[] q : queue) {
                    if (q[1] > cur[1]) {
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) {
                    queue.add(cur);
                } else {
                    printCount++;
                    if (cur[0] == M) {
                        strBuild.append(printCount).append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(strBuild.toString());
    }
}

package Baekjoon.Silver.S_24511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class S3_24511_queuestack {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        StringTokenizer strToken1 = new StringTokenizer(bufRead.readLine());
        StringTokenizer strToken2 = new StringTokenizer(bufRead.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(strToken1.nextToken());
            int B = Integer.parseInt(strToken2.nextToken());
            if (A == 0) {
                deque.add(B);
            }
        }

        int M = Integer.parseInt(bufRead.readLine());
        strToken1 = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < M; i++) {
            int C = Integer.parseInt(strToken1.nextToken());
            deque.addFirst(C);
            strBuild.append(deque.pollLast()).append(" ");
        }
        System.out.println(strBuild.toString());        
    }
    
}

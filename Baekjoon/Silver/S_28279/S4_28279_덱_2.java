package Baekjoon.Silver.S_28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class S4_28279_덱_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken;

        int N = Integer.parseInt(bufRead.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int command = Integer.parseInt(strToken.nextToken());

            switch (command) {
                case 1:
                    int X = Integer.parseInt(strToken.nextToken());
                    deque.addFirst(X);
                    break;
                case 2:
                    int Y = Integer.parseInt(strToken.nextToken());
                    deque.addLast(Y);
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(deque.pollFirst()).append("\n");
                    }
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(deque.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    strBuild.append(deque.size()).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        strBuild.append(1).append("\n");
                    } else {
                        strBuild.append(0).append("\n");
                    }
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(deque.peekFirst()).append("\n");
                    }
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(strBuild.toString());
    }
    
}

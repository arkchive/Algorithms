package Baekjoon.Silver.S_18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class S4_18258_큐_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            String command = strToken.nextToken();

            switch (command) {
                case "push":
                    int X = Integer.parseInt(strToken.nextToken());
                    queue.addLast(X);
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(queue.getFirst()).append("\n");
                        queue.removeFirst();
                    }
                    break;
                case "size":
                    strBuild.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        strBuild.append(1).append("\n");
                    } else {
                        strBuild.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(queue.getFirst()).append("\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(queue.getLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(strBuild.toString());
    } 
}

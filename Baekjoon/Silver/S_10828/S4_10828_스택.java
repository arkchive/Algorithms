package Baekjoon.Silver.S_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class S4_10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;
    
        int N = Integer.parseInt(bufRead.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            String command = strToken.nextToken();

            switch (command) {
                case "push":
                    int X = Integer.parseInt(strToken.nextToken());
                    stack.push(X);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(stack.pop()).append("\n");
                    }
                    break;
                case "size":
                    strBuild.append(stack.size()).append("\n");
                    break;
                case "empty":
                    strBuild.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        strBuild.append(stack.peek()).append("\n");
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(strBuild.toString());
    }
}

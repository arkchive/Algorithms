package Baekjoon.Silver.S_11866;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S4_11866_요세푸스_문제_0 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        int N = scan.nextInt();
        int K = scan.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        strBuild.append("<");
        while (deque.size() != 1) {
            for (int i = 0; i < K-1; i++) {
                deque.addLast(deque.pollFirst());
            }
            strBuild.append(deque.pollFirst()).append(", ");
        }
        strBuild.append(deque.poll()).append(">");
        System.out.println(strBuild.toString());        
    }
}

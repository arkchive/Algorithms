package Baekjoon.Silver.S_1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S3_1021_회전하는_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        int cnt = 0;
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(strToken.nextToken());

            int idx = deque.indexOf(target);
            int left = idx;
            int right = deque.size() - idx;

            if (left <= right) {
                while (left != 0) {
                    deque.addLast(deque.removeFirst());
                    left--;
                    cnt++;
                }
            } else {
                while (right != 0) {
                    deque.addFirst(deque.removeLast());
                    right--;
                    cnt++;
                }
            }
            deque.removeFirst();
        }
        System.out.println(cnt);
    }
}

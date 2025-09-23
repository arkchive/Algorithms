package Baekjoon.Silver.S_2164;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S2_2164_카드_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.pollFirst();
            queue.addLast(queue.pollFirst());
        }
        System.out.println(queue.peek());
    }
}

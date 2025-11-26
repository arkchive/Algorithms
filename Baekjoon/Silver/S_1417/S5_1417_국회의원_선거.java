package Baekjoon.Silver.S_1417;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class S5_1417_국회의원_선거 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        int dasom = scan.nextInt();

        if (N == 1) {
            System.out.println(0);
            return;
        }

        // 우선 순위 큐 생성(내림차순 정렬)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 다솜 표 제외 큐에 추가
        for (int i = 1; i < N; i++) {
            pq.add(scan.nextInt());
        }

        int count = 0;

        // 표수 비교
        while (!pq.isEmpty()) {
            int max = pq.poll();
            if (max < dasom) {
                break;
            } else {
                max--;
                dasom++;
                count++;

                pq.add(max);
            }
        }
        System.out.println(count);
    }
}

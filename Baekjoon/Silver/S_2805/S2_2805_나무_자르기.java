package Baekjoon.Silver.S_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_2805_나무_자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        int[] trees = new int[N];
        int maxHeight = 0;

        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(strToken.nextToken());
            maxHeight = Math.max(maxHeight, trees[i]);
        }

        long left = 0; // 절단기 높이가 될 수 있는 최소 값
        long right = maxHeight; // 절단기 높이가 될 수 있는 최대 값
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2; // 현재 절단기 높이
            long sum = 0; // mid로 잘랐을 때 얻는 목재의 길이 총합

            for (int t : trees) {
                if (t > mid) {
                    sum += t - mid;
                }
            }

            if (sum >= M) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}

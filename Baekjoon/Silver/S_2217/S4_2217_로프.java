package Baekjoon.Silver.S_2217;

import java.util.Arrays;
import java.util.Scanner;

public class S4_2217_로프 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = scan.nextInt();
        }
        Arrays.sort(W);
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int weight = W[i] * (N - i);
            max = Math.max(max, weight);
        }
        System.out.println(max);
    }
}

package Baekjoon.Bronze.B_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());
        int [] arr = new int[N];
        int M = 0;
        
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strToken.nextToken());
            if (arr[i] > M) M = arr[i];
        }

        double total = 0.0;

        for (int i = 0; i < N; i++) {
            double score = arr[i] * 100.0 / M;
            total += score;
        }

        System.out.println(total / N);
    }
}

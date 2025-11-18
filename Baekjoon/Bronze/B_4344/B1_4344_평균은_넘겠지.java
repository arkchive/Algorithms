package Baekjoon.Bronze.B_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_4344_평균은_넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int C = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
            int N = Integer.parseInt(strToken.nextToken());
            int[] scores = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(strToken.nextToken());
                sum += scores[j];
            }
            long avg = (long) sum / N;
            int cnt = 0;
            for (int score : scores) {
                if (score > avg) cnt++;
            }
            double result = (double) cnt / N;
            String percentage = String.format("%.3f", result * 100);
            strBuild.append(percentage).append("%\n");
        }
        System.out.println(strBuild.toString());
    }
}

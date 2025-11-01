package Baekjoon.Silver.S_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        int[] weight = new int[N];
        int[] height = new int[N];
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
            weight[i] = Integer.parseInt(strToken.nextToken());
            height[i] = Integer.parseInt(strToken.nextToken());
            rank[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (weight[j] > weight[i] && height[j] > height[i]) {
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            strBuild.append(rank[i]).append(' ');
        }
        System.out.println(strBuild.toString());
    }   
}

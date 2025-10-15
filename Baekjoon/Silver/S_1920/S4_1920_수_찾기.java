package Baekjoon.Silver.S_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class S4_1920_수_찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        HashSet<Integer> set = new HashSet<>(N * 2);
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(strToken.nextToken()));
        }

        int M = Integer.parseInt(bufRead.readLine());
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(strToken.nextToken());
            if (set.contains(num)) {
                strBuild.append(1).append("\n");
            } else {
                strBuild.append(0).append("\n");
            }
        }
        System.out.println(strBuild.toString());
    }
}

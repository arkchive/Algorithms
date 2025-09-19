package Baekjoon.Silver.S_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_10816_숫자_카드_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());

        Map<Integer, Integer> freq = new HashMap<>((int)(N / 0.75f) + 1);

        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i< N; i++) {
            int v = Integer.parseInt(strToken.nextToken());
            freq.merge(v, 1, Integer::sum);
        }

        int M = Integer.parseInt(bufRead.readLine());
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < M; i++) {
            int q = Integer.parseInt(strToken.nextToken());
            strBuild.append(freq.getOrDefault(q, 0)).append(" ");
        }
        System.out.println(strBuild.toString());
    }
    
}

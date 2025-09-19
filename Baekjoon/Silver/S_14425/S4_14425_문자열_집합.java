package Baekjoon.Silver.S_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S4_14425_문자열_집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        Set<String> S = new HashSet<>(N*2);
        for (int i = 0; i < N; i++) {
            S.add(bufRead.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String str = bufRead.readLine();
            if(S.contains(str)) cnt++;
        }
        System.out.println(cnt);
    }
    
}

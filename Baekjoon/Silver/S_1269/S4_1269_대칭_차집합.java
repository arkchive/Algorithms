package Baekjoon.Silver.S_1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S4_1269_대칭_차집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        Set<Integer> sA = new HashSet<>();
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            sA.add(Integer.parseInt(strToken.nextToken()));
        }

        Set<Integer> sB = new HashSet<>();
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < M; i++) {
            sB.add(Integer.parseInt(strToken.nextToken()));
        }

        int cntA = 0;
        for (int i : sA) {
            if(sB.contains(i)) continue;
            cntA++;
        }
        
        int cntB = 0;
        for (int i : sB) {
            if(sA.contains(i)) continue;
            cntB++;
        }
        System.out.println(cntA + cntB);
    }
}

package Baekjoon.Silver.S_26069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S4_26069_붙임성_좋은_총총이 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken;

        int N = Integer.parseInt(bufRead.readLine());
        Set<String> dancing = new HashSet<>();
        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            String A = strToken.nextToken();
            String B = strToken.nextToken();
            if (A.equals("ChongChong") || B.equals("ChongChong")) {
                dancing.add(A);
                dancing.add(B);
            }
            if (dancing.contains(A) || dancing.contains(B)) {
                dancing.add(A);
                dancing.add(B);
            }
        }
        System.out.println(dancing.size());
        
    }
    
}

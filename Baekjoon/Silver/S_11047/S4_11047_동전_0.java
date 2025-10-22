package Baekjoon.Silver.S_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_11047_동전_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int N = Integer.parseInt(strToken.nextToken());
        int K = Integer.parseInt(strToken.nextToken());

        Integer[] moneys = new Integer[N];
        for (int i = 0 ; i < N; i++) {
            moneys[i] = Integer.parseInt(bufRead.readLine());
        }
        
        Arrays.sort(moneys, (a, b) -> b - a);

        int cnt = 0;
        int remainder = K;
        for (int money : moneys) {
            if (money > remainder) continue;
            cnt += remainder / money;
            remainder %= money;
        }
        System.out.println(cnt);
    }
}

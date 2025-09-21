package Baekjoon.Silver.S_17103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S2_17103_골드바흐_파티션 {

    static final int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        sieve();

        int T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bufRead.readLine());
            int cnt = 0;
            
            for (int p = 2; p <= N / 2; p++) {
                if (isPrime[p] && isPrime[N-p]) cnt++;
            }
            strBuild.append(cnt).append("\n");
        }
        System.out.println(strBuild.toString());
    }

    private static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= MAX; j += i) {
                isPrime[j] = false;
            }
        }
    }
    
}

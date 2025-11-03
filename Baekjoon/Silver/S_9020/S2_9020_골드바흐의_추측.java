package Baekjoon.Silver.S_9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_9020_골드바흐의_추측 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        boolean[] isPrime = new boolean[10001];
        for (int i = 2; i < 10001; i++) isPrime[i] = true;
        for (int i = 2; i < 10001; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < 10001; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int T = Integer.parseInt(bufRead.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(bufRead.readLine());
            int a = n / 2; 
            int b = n / 2;

            while (true) {
                if (isPrime[a] && isPrime[b]) {
                    strBuild.append(a).append(' ').append(b).append('\n');
                    break;
                }
                a--;
                b++;
            }
        }
        System.out.println(strBuild.toString());
    }
}

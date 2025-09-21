package Baekjoon.Silver.S_4134;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_4134_다음_소수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        int T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(bufRead.readLine());

            if (n <= 2) {
                strBuild.append(2).append("\n");
                continue;
            }

            while (!isPrime(n)) {
                n++;
            }
            strBuild.append(n).append("\n");
        }
        System.out.println(strBuild.toString());
    }

    private static boolean isPrime(Long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (long i = 5; i * i <= n; i+=6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    
}

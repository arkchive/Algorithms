package Baekjoon.Silver.S_1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1629_곱셈 {
    static long A, B, C;
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        A = Long.parseLong(strToken.nextToken());
        B = Long.parseLong(strToken.nextToken());
        C = Long.parseLong(strToken.nextToken());

        System.out.println(pow(A, B));
    }

    static long pow(long a, long b) {
        if (b == 0) return 1;

        long half = pow(a, b / 2) % C;

        if (b % 2 == 0) {
            return (half * half) % C;
        } else {
            return (((half * half) % C) * a) % C;
        }
    }
}

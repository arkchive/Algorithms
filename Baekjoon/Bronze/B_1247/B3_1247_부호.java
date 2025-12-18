package Baekjoon.Bronze.B_1247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B3_1247_부호 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 0; t < 3; t++) {
            int N = Integer.parseInt(bufRead.readLine());
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < N; i++) {
                BigInteger num = new BigInteger(bufRead.readLine());
                sum = sum.add(num);
            }

            int sign = sum.signum();
            if (sign > 0) {
                System.out.println("+");
            } else if (sign < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}

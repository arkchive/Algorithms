package Baekjoon.Silver.S_1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1735_분수_합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken1 = new StringTokenizer(bufRead.readLine());
        StringTokenizer strToken2 = new StringTokenizer(bufRead.readLine());

        long a = Long.parseLong(strToken1.nextToken());
        long b = Long.parseLong(strToken1.nextToken());
        long c = Long.parseLong(strToken2.nextToken());
        long d = Long.parseLong(strToken2.nextToken());

        long gcd = gcd(b, d);
        long lcm = b * d / gcd;

        long num = a * (lcm / b) + c * (lcm / d);
        long den = lcm;

        long gcd2 = gcd(num, den);
        num /= gcd2;
        den /= gcd2;

        System.out.println(num + " " + den);
    }

    private static long gcd(long x, long y) {
        while (y != 0) {
            long term = x % y;
            x = y;
            y = term;
        }

        return x;
    }
    
}

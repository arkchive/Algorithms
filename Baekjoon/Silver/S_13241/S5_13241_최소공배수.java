package Baekjoon.Silver.S_13241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_13241_최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        long A = Long.parseLong(strToken.nextToken());
        long B = Long.parseLong(strToken.nextToken());

        long gcd = gcd(A, B);

        System.out.println((long) A * B / gcd);
    }

    private static long gcd(long A, long B) {
        while (B != 0) {
            Long temp = A % B;
            A = B;
            B = temp;
        }
        return A;
    }
    
}

package Baekjoon.Bronze.B_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_1934_최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken;
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());
        for (int i = 0; i < T; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int A = Integer.parseInt(strToken.nextToken());
            int B = Integer.parseInt(strToken.nextToken());
            int gcd = gcd(A, B);
            strBuild.append((long)A * B / gcd).append("\n");
        }
        System.out.println(strBuild.toString());
    }

    private static int gcd(int A, int B) {
        while (B != 0) {
            int temp = A % B;
            A = B;
            B = temp;
        }
        return A;
    }    
}

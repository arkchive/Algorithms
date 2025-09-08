package Baekjoon.Bronze.B_25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_25304_영수증 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int X = Integer.parseInt(bufRead.readLine());
        int N = Integer.parseInt(bufRead.readLine());
        int total = 0;

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int a = Integer.parseInt(strToken.nextToken());
            int b = Integer.parseInt(strToken.nextToken());
            
            total += a * b;
        }

        if (total == X) System.out.println("Yes");
        else System.out.println("No");

    }
}

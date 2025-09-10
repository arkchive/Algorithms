package Baekjoon.Bronze.B_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_10818_최소_최대 {

    static int MAX = -1000000;
    static int MIN = 10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufRead.readLine());
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        for (int i = 0; i <  N; i++) {
            int num = Integer.parseInt(strToken.nextToken());
            if (num > MAX) MAX = num;
            if (num < MIN) MIN = num;
        }
        System.out.println(MIN + " " + MAX);
    }
    
}

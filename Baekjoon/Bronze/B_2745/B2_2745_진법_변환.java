package Baekjoon.Bronze.B_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2745_진법_변환 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        String N = strToken.nextToken();
        int B = Integer.parseInt(strToken.nextToken());

        long result = 0;
        for (int i = 0; i < N.length(); i++) {
            char c= N.charAt(i);
            int digit;

            if ('0' <= c && c <= '9') {
                digit = c - '0';
            } else {
                digit = c - 'A' + 10;
            }
            result = result * B + digit;
            
        }
        System.out.println(result);
    }
    
}

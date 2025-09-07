package Baekjoon.Bronze.B_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2525_오븐_시계 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        strToken = new StringTokenizer(bufRead.readLine());
        int H = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        int time = Integer.parseInt(bufRead.readLine());

        int total = H * 60 + M;
        total += time;

        if (total >= 24 * 60) total -= 24 * 60;
        
        int newH = total / 60;
        int newM = total % 60;

        System.out.println(newH + " " + newM);

    }
    
}

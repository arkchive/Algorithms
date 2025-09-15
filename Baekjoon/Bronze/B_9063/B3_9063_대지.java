package Baekjoon.Bronze.B_9063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_9063_대지 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        int N = Integer.parseInt(bufRead.readLine());

        int x_min = 10000;
        int y_min = 10000;
        int x_max = -10000;
        int y_max = -10000;
        
        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int x = Integer.parseInt(strToken.nextToken());
            int y = Integer.parseInt(strToken.nextToken());

            if (N == 1) {
                System.out.println(0); 
                return;
            } 

            if (x > x_max) x_max = x;
            if (x < x_min) x_min = x;
            if (y > y_max) y_max = y;
            if (y < y_min) y_min = y;
        }

        System.out.println((x_max - x_min) * (y_max - y_min));
    }
    
}

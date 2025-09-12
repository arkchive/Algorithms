package Baekjoon.Bronze.B_2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2566_최댓값 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int max = 0;
        int rowIdx = 0;
        int colIdx = 0;
        
        for (int i = 0; i < 9; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(strToken.nextToken());
                if (num > max) {
                    max = num;
                    rowIdx = i;
                    colIdx = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((rowIdx+1) + " " + (colIdx+1));

    }
    
}

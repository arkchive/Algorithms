package Baekjoon.Bronze.B_2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2739_구구단 {

    public static void main(String[] args) throws IOException{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int dan = Integer.parseInt(bufRead.readLine());

        for ( int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan*i );
        }
    }
    
}

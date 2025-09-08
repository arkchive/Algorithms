package Baekjoon.Bronze.B_10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_10952_AB_덧셈_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        while (true) {
            StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
            int A = Integer.parseInt(strToken.nextToken());
            int B = Integer.parseInt(strToken.nextToken());
            
            if (A == 0 && B == 0) break;
            
            strBuild.append(A+B).append("\n");
        } // while
        System.out.println(strBuild.toString());
    } // main
}

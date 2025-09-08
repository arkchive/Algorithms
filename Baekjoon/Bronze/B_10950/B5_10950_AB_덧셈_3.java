package Baekjoon.Bronze.B_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_10950_AB_덧셈_3 {

    public static void main(String[] args) throws IOException{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int A = Integer.parseInt(strToken.nextToken());
            int B = Integer.parseInt(strToken.nextToken());

            strBuild.append(A+B).append("\n");
            
        } // for

        System.out.println(strBuild.toString());
    } // main
    
}

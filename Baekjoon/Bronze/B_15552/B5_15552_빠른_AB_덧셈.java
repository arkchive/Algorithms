package Baekjoon.Bronze.B_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B5_15552_빠른_AB_덧셈 {

    public static void main(String[] args) throws IOException{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufWrite = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
            int A = Integer.parseInt(strToken.nextToken());
            int B = Integer.parseInt(strToken.nextToken());

            bufWrite.write((A+B) + "\n");
        } // for

        bufWrite.flush();
    } // main
    
}

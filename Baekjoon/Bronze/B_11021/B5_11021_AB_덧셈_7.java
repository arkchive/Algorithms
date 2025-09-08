package Baekjoon.Bronze.B_11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_11021_AB_덧셈_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++ ) {
            StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
            int A = Integer.parseInt(strToken.nextToken());
            int B = Integer.parseInt(strToken.nextToken());

            strBuild.append("Case #")
                    .append(i + 1)
                    .append(": ")
                    .append(A + B)
                    .append( "\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

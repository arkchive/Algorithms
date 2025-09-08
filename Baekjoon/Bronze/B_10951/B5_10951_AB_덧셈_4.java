package Baekjoon.Bronze.B_10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_10951_AB_덧셈_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        String line;
        while ((line = bufRead.readLine()) != null) {
            StringTokenizer strToken = new StringTokenizer(line);
            
            int A = Integer.parseInt(strToken.nextToken());
            int B = Integer.parseInt(strToken.nextToken());

            strBuild.append(A+B).append("\n");
        } // while
        System.out.println(strBuild);
    }
    
}

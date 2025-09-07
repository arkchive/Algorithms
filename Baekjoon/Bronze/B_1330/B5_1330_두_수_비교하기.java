package Baekjoon.Bronze.B_1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_1330_두_수_비교하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        strToken = new StringTokenizer( bufRead.readLine(), " ");
        int A = Integer.parseInt(strToken.nextToken());
        int B = Integer.parseInt(strToken.nextToken());

        if (A > B) System.out.println(">");
        else if (A < B) System.out.println("<");
        else System.out.println("==");
    }
    
}

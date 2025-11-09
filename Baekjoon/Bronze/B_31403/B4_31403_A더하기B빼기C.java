package Baekjoon.Bronze.B_31403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_31403_A더하기B빼기C {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        int A = Integer.parseInt(bufRead.readLine());
        int B = Integer.parseInt(bufRead.readLine());
        int C = Integer.parseInt(bufRead.readLine());

        strBuild.append(A+B-C).append('\n');
        String strA = Integer.toString(A);
        String strB = Integer.toString(B);
        int sum = Integer.parseInt(strA+strB);
        strBuild.append(sum-C);
        
        System.out.println(strBuild.toString());        
    }
}

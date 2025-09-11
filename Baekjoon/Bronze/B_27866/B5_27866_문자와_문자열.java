package Baekjoon.Bronze.B_27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_27866_문자와_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        String S = bufRead.readLine();
        int i = Integer.parseInt(bufRead.readLine());

        System.out.println(S.charAt(i-1));
    }
}

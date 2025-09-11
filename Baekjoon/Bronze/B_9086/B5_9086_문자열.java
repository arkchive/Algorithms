package Baekjoon.Bronze.B_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_9086_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++) {
            String str = bufRead.readLine();
            strBuild.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }
        System.out.println(strBuild.toString());
    }  
}

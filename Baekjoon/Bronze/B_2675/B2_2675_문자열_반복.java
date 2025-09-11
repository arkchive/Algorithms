package Baekjoon.Bronze.B_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2675_문자열_반복 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
            int R = Integer.parseInt(strToken.nextToken());
            String S = strToken.nextToken();
            
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    strBuild.append(S.charAt(j));
                }
            }
            strBuild.append("\n");
        }

        System.out.println(strBuild.toString().trim());
    }
    
}

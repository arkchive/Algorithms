package Baekjoon.Bronze.B_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_8958_OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());
        for (int i = 0; i < T; i++) {
            char[] results = bufRead.readLine().toCharArray();
            int[] score = new int[results.length];
            boolean prefix = false;
            int sum = 0;
            for (int j = 0; j < results.length; j++) {
                if (results[j] == 'O') {
                    if (!prefix) {
                        score[j] = 1;
                        prefix = true;
                    } else {
                        score[j] = score[j-1] + 1; 
                    }
                } else {
                    score[j] = 0;
                    prefix = false;
                }
                sum += score[j];
            }
            strBuild.append(sum).append('\n');
        }
        System.out.println(strBuild.toString());
    }
}

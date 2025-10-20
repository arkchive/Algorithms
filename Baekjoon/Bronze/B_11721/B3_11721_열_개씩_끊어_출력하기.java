package Baekjoon.Bronze.B_11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_11721_열_개씩_끊어_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        String line = bufRead.readLine();

        for (int i = 0; i < line.length(); i++) {
            strBuild.append(line.charAt(i));
            if((i+1) % 10 == 0) {
                strBuild.append("\n");
            }
        }
        System.out.println(strBuild.toString());
    }
}

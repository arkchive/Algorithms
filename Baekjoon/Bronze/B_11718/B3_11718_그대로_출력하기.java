package Baekjoon.Bronze.B_11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_11718_그대로_출력하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        String line;
        while ((line = bufRead.readLine()) != null) {
            strBuild.append(line).append("\n");
        }
        System.out.println(strBuild.toString().trim());
    }
    
}

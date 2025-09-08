package Baekjoon.Bronze.B_25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_25314_코딩은_체육과목_입니다 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());

        // while(N != 0) {
        //     strBuild.append("long").append(" ");
        //     N -= 4;
        // }

        for(int i = 0; i < N / 4; i++) {
            strBuild.append("long ");
        }
        strBuild.append("int");

        System.out.println(strBuild.toString());
        
    }
    
}

package Baekjoon.Silver.S_4779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_4779_칸토어_집합 {

    static StringBuilder strBuild = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
    
        String line;
        while((line = bufRead.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            int N = Integer.parseInt(line);
            int len = (int)Math.pow(3, N);
            cantor(len);
            strBuild.append('\n');
        }
        System.out.println(strBuild.toString());
    }

    static void cantor(int len) {
        if (len == 1) {
            strBuild.append('-');
            return;
        }
        int third = len / 3;
        cantor(third);
        for (int i = 0; i < third; i++) strBuild.append(' ');
        cantor(third);
    }
    
}

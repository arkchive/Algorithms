package Baekjoon.Bronze.B_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_5086_배수와_약수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        while(true) {
            strToken = new StringTokenizer(bufRead.readLine());
            int A = Integer.parseInt(strToken.nextToken());
            int B = Integer.parseInt(strToken.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            if (A % B == 0) {
                strBuild.append("multiple");
            } else if (B % A == 0) {
                strBuild.append("factor");
            } else {
                strBuild.append("neither");
            }

            strBuild.append("\n");
        }
        System.out.println(strBuild.toString());

    }
    
}

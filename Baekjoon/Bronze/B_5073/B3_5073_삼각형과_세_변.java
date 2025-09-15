package Baekjoon.Bronze.B_5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_5073_삼각형과_세_변 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        while(true) {
            strToken = new StringTokenizer(bufRead.readLine());
            int a = Integer.parseInt(strToken.nextToken());
            int b = Integer.parseInt(strToken.nextToken());
            int c = Integer.parseInt(strToken.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int sum = a + b + c;
            int max = Math.max(a, Math.max(b, c));
            if (max >= sum - max) {
                strBuild.append("Invalid").append("\n");
            } else {
                if (a == b && a == c && b == c) {
                strBuild.append("Equilateral").append("\n");
                } else if(a == b || a == c || b == c) {
                    strBuild.append("Isosceles").append("\n");
                } else {
                    strBuild.append("Scalene").append("\n");
                }
            }
        }
        System.out.println(strBuild.toString());
    }
    
}

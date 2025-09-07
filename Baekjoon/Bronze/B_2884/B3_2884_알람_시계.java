package Baekjoon.Bronze.B_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2884_알람_시계 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        // StringBuilder strBuild = new StringBuilder();

        strToken = new StringTokenizer(bufRead.readLine());
        int H = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        // if (M < 45) {
        //     if(H == 0) strBuild.append(23).append(" ");
        //     else strBuild.append(H-1).append(" ");
        //     strBuild.append(60-(45-M));
        // } else {
        //     strBuild.append(H).append(" ");
        //     strBuild.append(M-45);
        // }
        // System.out.println(strBuild.toString());

        int total = H * 60 + M;
        total -= 45;
        if (total < 0) total += 24 * 60;

        int newH = total / 60;
        int newM = total % 60;

        System.out.println(newH + " " + newM);
    }
    
}

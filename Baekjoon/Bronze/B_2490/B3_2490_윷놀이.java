package Baekjoon.Bronze.B_2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2490_윷놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;

        for (int i = 0; i < 3; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int yut_cnt = 0;
            for (int j = 0; j < 4; j++) {
                int yut = Integer.parseInt(strToken.nextToken());
                if (yut == 0) yut_cnt++;
            }
            switch (yut_cnt) {
                case 0:
                    strBuild.append('E').append('\n');
                    break;
                case 1:
                    strBuild.append('A').append('\n');                    
                    break;
                case 2:
                    strBuild.append('B').append('\n');                    
                    break;
                case 3:
                    strBuild.append('C').append('\n');                    
                    break;
                case 4:
                    strBuild.append('D').append('\n');
                    break;
                default:
                    break;
            }
        }
        System.out.println(strBuild.toString());
    }
}

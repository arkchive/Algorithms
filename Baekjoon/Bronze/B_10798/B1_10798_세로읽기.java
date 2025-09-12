package Baekjoon.Bronze.B_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_10798_세로읽기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        char[][] matrix = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = bufRead.readLine();
            for (int j = 0; j < str.length(); j++) {
                matrix[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) { // 열
            for (int j = 0; j < 5; j++) { // 행
                if (matrix[j][i] == '\0') {
                    continue;
                }
                strBuild.append(matrix[j][i]);
            }
        }
        System.out.println(strBuild.toString());
    }
    
}

package Baekjoon.Bronze.B_2444;

import java.util.Scanner;

public class B3_2444_별_찍기_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        int N = scan.nextInt();

        for (int i = 1; i <= (2 * N - 1); i++) {
            if (i <= N) {
                for (int j = 0; j < (N - i); j++) {
                    strBuild.append(' ');
                }
                for (int k = 0; k < (2 * i - 1); k++) {
                    strBuild.append('*');
                }
                strBuild.append('\n');
            } else {
                for (int j = 0; j < (i - N); j++) {
                    strBuild.append(' ');
                }
                for (int k = 0; k < 2 * (2 * N - i) - 1; k++) {
                    strBuild.append('*');
                }
                strBuild.append('\n');
            }
        }
        
        System.out.println(strBuild.toString());
        scan.close();
    }
    
}

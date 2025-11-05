package Baekjoon.Bronze.B_2440;

import java.util.Scanner;

public class B4_2440_별_찍기_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i; j++) {
                strBuild.append('*');
            }
            strBuild.append('\n');
        }
        System.out.println(strBuild.toString());
    }
}
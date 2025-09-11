package Baekjoon.Bronze.B_10809;

import java.util.Scanner;

public class B2_10809_알파벳_찾기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        String S = scan.nextLine();
        
        for (char c = 'a'; c <= 'z'; c++) {
            strBuild.append(S.indexOf(c)).append(" ");
        }
        System.out.println(strBuild.toString());
        scan.close();
    }
}

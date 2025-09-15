package Baekjoon.Bronze.B_2720;

import java.util.Scanner;

public class B3_2720_세탁소_사장_동혁 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int C = scan.nextInt();

            int q = C / 25;
            C %= 25;

            int d = C / 10;
            C %= 10;

            int n = C / 5;
            C %= 5;

            int p = C;

            strBuild.append(q).append(" ").append(d).append(" ").append(n).append(" ").append(p).append(" ").append("\n");
        }
        System.out.println(strBuild.toString());
        scan.close();
    }
    
}

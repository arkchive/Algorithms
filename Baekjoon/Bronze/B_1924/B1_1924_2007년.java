package Baekjoon.Bronze.B_1924;

import java.util.Scanner;

public class B1_1924_2007년 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = y;
        for (int i = 0; i < x-1; i++) {
            days += md[i];
        }

        String[] w = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        System.out.println(w[days % 7]);
    }
}

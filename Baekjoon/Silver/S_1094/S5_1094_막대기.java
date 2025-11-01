package Baekjoon.Silver.S_1094;

import java.util.Scanner;

public class S5_1094_막대기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int cnt = 0;

        while (X > 0) {
            if (X % 2 == 1) cnt++;
            X /= 2;
        }
        
        System.out.println(cnt);
    }
}
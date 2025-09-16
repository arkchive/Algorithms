package Baekjoon.Silver.S_1436;

import java.util.Scanner;

public class S5_1436_영화감독_숌 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int cnt = 0;
        int series = 665;
        while (true) {
            series++;
            if (String.valueOf(series).contains("666")) {
                cnt++;
            }
            if (cnt == N) {
                System.out.println(series);
                return;
            }   
        }
    }
}

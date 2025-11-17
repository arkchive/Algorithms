package Baekjoon.Silver.S_1024;

import java.util.Scanner;

public class S2_1024_수열의_합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        long N = scan.nextLong();
        int L = scan.nextInt();
        
        boolean found = false;

        for (int i = L; i <= 100; i++) {
            long temp = N - (long)(i * (i-1)) / 2;

            if (temp < 0) break;

            if (temp % i == 0) {
                long x = temp / i;
                for (int j = 0; j < i; j++) {
                    strBuild.append(x+j).append(' ');
                }
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(strBuild.toString());
        } else {
            System.out.println(-1);
        }
    }
}

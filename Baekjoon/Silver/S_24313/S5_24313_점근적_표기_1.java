package Baekjoon.Silver.S_24313;

import java.util.Scanner;

public class S5_24313_점근적_표기_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a0 = scan.nextInt();
        int c = scan.nextInt();
        int n0 = scan.nextInt();

        if (a1 > c) {
            System.out.println(0);
            return;
        }

        if (a1 == c) {
            System.out.println(a0 <= 0 ? 1 : 0);
            return;
        }

        long left = a1 * n0 + a0;
        long right = c * n0;
        System.out.println(left <= right ? 1 : 0);

        scan.close();
    }
    
}

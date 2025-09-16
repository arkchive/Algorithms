package Baekjoon.Bronze.B_24267;

import java.util.Scanner;

public class B2_24267_알고리즘의_수행_시간_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();

        System.out.println(n*(n-1)*(n-2) / 6);
        System.out.println(3);

        scan.close();
    }
    
}

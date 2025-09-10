package Baekjoon.Bronze.B_2562;

import java.util.Scanner;

public class B3_2562_최댓값 {

    static int N = 9;
    static int MAX = 0;
    static int iDX = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            if (num > MAX) {
                MAX = num;
                iDX = i+1;
            }
        }
        System.out.println(MAX);
        System.out.println(iDX);

        scan.close();
    }
    
}

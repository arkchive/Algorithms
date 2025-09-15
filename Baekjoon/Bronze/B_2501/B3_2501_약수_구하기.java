package Baekjoon.Bronze.B_2501;

import java.util.Scanner;

public class B3_2501_약수_구하기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int idx = 0;


        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                idx++;
                if (idx == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
        scan.close();
    }
    
}

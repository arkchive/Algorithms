package Baekjoon.Bronze.B_11653;

import java.util.Scanner;

public class B1_11653_소인수분해 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.close();

        if (N == 1) return;

        for (int i = 2; i*i <= N; i++) {
            while (N % i == 0) {
                N /= i;
                System.out.println(i);
            } // while
        } // for - i

        if (N > 1) {
            System.out.println(N);
        }
    }
    
}

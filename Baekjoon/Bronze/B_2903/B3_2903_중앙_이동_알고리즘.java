package Baekjoon.Bronze.B_2903;

import java.util.Scanner;

public class B3_2903_중앙_이동_알고리즘 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int p = 2;
        for (int i = 0; i < N; i++) {
            p += (p-1);
        }
        System.out.println(p*p);
        scan.close();
    }
    
}

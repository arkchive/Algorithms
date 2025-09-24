package Baekjoon.Bronze.B_10872;

import java.util.Scanner;

public class B3_10872_팩토리얼 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result = 1;
        if (N == 0) {
            System.out.println(result);
            return;
        }
        while(N != 0) {
            result *= N;
            N -= 1;
        }
        System.out.println(result);
    }
    
}

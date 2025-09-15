package Baekjoon.Bronze.B_11005;

import java.util.Scanner;

public class B1_11005_진법_변환_2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        int N = scan.nextInt();
        int B = scan.nextInt();

        while (N > 0) {
            int remainder = N % B;
            char digit;
            if (remainder < 10) {
                digit = (char)('0' + remainder);
            } else {
                digit = (char)('A' + (remainder - 10));
            }
            strBuild.append(digit);
            N /= B;
        }
        System.out.println(strBuild.reverse().toString());
        scan.close();
    }
}

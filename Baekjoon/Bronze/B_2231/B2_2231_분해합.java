package Baekjoon.Bronze.B_2231;

import java.util.Scanner;

public class B2_2231_분해합 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int result = 0;
        for (int i = 1; i < N; i++) {
            if (i + digitSum(i) == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    private static int digitSum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }
    
}

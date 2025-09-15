package Baekjoon.Bronze.B_14215;

import java.util.Scanner;

public class B3_14215_세_막대 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum = a + b + c;
        int max = Math.max(a, Math.max(b, c));
        int sub_sum = sum - max;

        if (max >= sub_sum) {
            while (max >= sub_sum) {
                max--;
            }
            System.out.println(sub_sum + max);
        } else {
            System.out.println(sum);
        }
        scan.close();
    }
    
}

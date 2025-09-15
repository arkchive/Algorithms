package Baekjoon.Bronze.B_2292;

import java.util.Scanner;

public class B2_2292_벌집 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int layer = 1;
        int max = 1;

        while (N > max) {
            max += 6 * layer;
            layer++;
        }
        System.out.println(layer);
        scan.close();
    }
    
}

package Baekjoon.Silver.S_9656;

import java.util.Scanner;

public class S5_9656_돌_게임_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if (N % 2 == 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}

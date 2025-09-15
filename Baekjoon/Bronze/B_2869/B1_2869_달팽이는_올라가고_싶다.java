package Baekjoon.Bronze.B_2869;

import java.util.Scanner;

public class B1_2869_달팽이는_올라가고_싶다 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        int day = (int)Math.ceil((double)(V - A) / (A - B) + 1);
        // int day = (V - A + (A - B) - 1) / (A - B) + 1;
        System.out.println(day);
        scan.close();
    }
    
}

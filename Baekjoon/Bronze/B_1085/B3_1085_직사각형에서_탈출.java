package Baekjoon.Bronze.B_1085;

import java.util.Scanner;

public class B3_1085_직사각형에서_탈출 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int x_min = Math.min(w-x, x); 
        int y_min = Math.min(h-y, y);
        
        System.out.println(Math.min(x_min, y_min));
    }
    
}

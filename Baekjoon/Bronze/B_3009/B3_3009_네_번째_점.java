package Baekjoon.Bronze.B_3009;

import java.util.Scanner;

public class B3_3009_네_번째_점 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x1 = scan.nextInt(); int y1 = scan.nextInt();
        int x2 = scan.nextInt(); int y2 = scan.nextInt();
        int x3 = scan.nextInt(); int y3 = scan.nextInt();

        int x4 = (x1 == x2) ? x3 : (x1 == x3 ? x2 : x1);
        int y4 = (y1 == y2) ? y3 : (y1 == y3 ? y2 : y1);

        System.out.println(x4 + " " + y4);

        scan.close();
    }
    
}

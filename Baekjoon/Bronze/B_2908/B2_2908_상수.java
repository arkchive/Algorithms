package Baekjoon.Bronze.B_2908;

import java.util.Scanner;

public class B2_2908_상수 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");
        for (int i = 0; i < 2; i++) {
            strArr[i] = new StringBuilder(strArr[i]).reverse().toString();
        }
        int A = Integer.parseInt(strArr[0]), B = Integer.parseInt(strArr[1]);
        
        // String A = new StringBuilder(scan.next()).reverse().toString();
        // String B = new StringBuilder(scan.next()).reverse().toString();
        // System.out.println(Math.max(Integer.parseInt(A), Integer.parseInt(B)));
        
        System.out.println(Math.max(A, B));
        scan.close();
    }
    
}

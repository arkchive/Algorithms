package Baekjoon.Bronze.B_5622;

import java.util.Scanner;

public class B2_5622_다이얼 {
    static int sum = 0;
    static int[] dial = {
        3, 3, 3,        // ABC
        4, 4, 4,        // DEF
        5, 5, 5,        // GHI
        6, 6, 6,        // JKL
        7, 7, 7,        // MNO
        8, 8, 8, 8,     // PQRS
        9, 9, 9,        // TUV
        10, 10, 10, 10  //WXYZ
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            sum += dial[(str.charAt(i) - 'A')];
        }
        System.out.println(sum);
        scan.close();
    }
}

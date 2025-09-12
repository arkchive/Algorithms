package Baekjoon.Bronze.B_1157;

import java.util.Scanner;

public class B1_1157_단어_공부 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'A']++;
        }

        int max = -1;
        int maxIdx = -1;
        int maxCnt = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIdx = i;
                maxCnt = 1;
            } else if (count[i] == max) {
                maxCnt++;
            }
        }

        if (maxCnt >= 2) {
            System.out.println('?');
        } else {
            System.out.println((char)('A' + maxIdx));
        }

        scan.close();
    }
    
}

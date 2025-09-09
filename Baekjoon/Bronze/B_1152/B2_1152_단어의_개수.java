package Baekjoon.Bronze.B_1152;

import java.util.Scanner;

public class B2_1152_단어의_개수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String [] arr = str.trim().split("\\s+");
            System.out.println(arr.length);
        }
        scan.close();
    } 
}

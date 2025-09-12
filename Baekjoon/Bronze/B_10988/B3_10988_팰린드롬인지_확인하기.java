package Baekjoon.Bronze.B_10988;

import java.util.Scanner;

public class B3_10988_팰린드롬인지_확인하기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        for (int i = 0; i < (line.length() / 2); i++) {
            if(line.charAt(i) != line.charAt(line.length()-i-1)) {
                System.out.println(0);
                scan.close();
                return;
            }
        } 
        System.out.println(1);
        scan.close();
    }
    
}

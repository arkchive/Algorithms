package Baekjoon.Silver.S_11478;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S3_11478_서로_다른_부분_문자열의_개수 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
    
}

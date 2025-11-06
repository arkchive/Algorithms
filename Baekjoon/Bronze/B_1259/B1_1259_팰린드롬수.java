package Baekjoon.Bronze.B_1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        while(true) {
            String line = bufRead.readLine();
            if (line.equals("0")) break;

            char[] arr = line.toCharArray();
            int N = arr.length;
            boolean isPalindrome = true;

            for (int i = 0; i < N / 2; i++) {
                if (arr[i] == arr[N-i-1]) continue;
                else {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) strBuild.append("yes").append('\n');
            else strBuild.append("no").append('\n');
            
        }
        System.out.println(strBuild.toString());
    }
}

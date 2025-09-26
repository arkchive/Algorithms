package Baekjoon.Bronze.B_25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_25501_재귀의_귀재 {
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        int T = Integer.parseInt(bufRead.readLine());
        
        for (int i = 0; i < T; i++) {
            cnt = 0;
            String s = bufRead.readLine();
            strBuild.append(isPalindrome(s)).append(" ").append(cnt).append("\n");
        }
        System.out.println(strBuild.toString());
    }

    static int recursion(String s, int l, int r) {
        cnt++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }
}

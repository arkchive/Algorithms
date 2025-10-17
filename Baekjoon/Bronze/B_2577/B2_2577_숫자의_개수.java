package Baekjoon.Bronze.B_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2577_숫자의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int A = Integer.parseInt(bufRead.readLine());
        int B = Integer.parseInt(bufRead.readLine());
        int C = Integer.parseInt(bufRead.readLine());

        long result = A * B * C;
        String str = Long.toString(result);
        int[] cnt = new int[10];
        
        for(int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            cnt[digit] += 1;
        }

        for(int i = 0; i < 10; i++) {
            strBuild.append(cnt[i]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
}

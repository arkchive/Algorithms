package Baekjoon.Bronze.B_1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1032_명령_프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());
        String[] files = new String[N];

        for (int i = 0 ; i < N; i++) {
            files[i] = bufRead.readLine();
        }
        
        char[] search = files[0].toCharArray();

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < search.length; j++) {
                if (search[j] != files[i].charAt(j)) {
                    search[j] = '?';
                }
            }
        }
        System.out.println(new String(search));
    }
}

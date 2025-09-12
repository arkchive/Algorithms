package Baekjoon.Silver.S_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1316_그룹_단어_체커 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());
        int cnt = 0;
        

        for (int i = 0; i < N; i++) {
            boolean[] isAlready = new boolean[26];
            String str = bufRead.readLine();
            char prev = 0;
            boolean ok = true;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                int idx = c - 'a';

                if (c != prev && isAlready[idx]) { // 연속되지 않고 이전에 썼던 문자가 나왔다 -> 그룹 단어 아님
                    ok = false;
                    break;
                }
                isAlready[idx] = true;
                prev = c;             
            } // for - j

            if (ok) cnt++;
        } // for - i
        System.out.println(cnt);
    } // main
    
}

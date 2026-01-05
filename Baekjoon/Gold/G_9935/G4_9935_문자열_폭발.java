package Baekjoon.Gold.G_9935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G4_9935_문자열_폭발 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        
        String input = bufRead.readLine();
        String bomb = bufRead.readLine();

        int bombLen = bomb.length();
        char bombLast = bomb.charAt(bombLen - 1);

        for (char c : input.toCharArray()) {
            strBuild.append(c);

            // bomb 끝 글자랑 같을 때 검사
            if (c == bombLast && strBuild.length() >= bombLen) {
                boolean isBomb = true;

                for (int i = 0; i < bombLen; i++) {
                    if (strBuild.charAt(strBuild.length() - bombLen + i) != bomb.charAt(i)) {
                        isBomb = false;
                        break;
                    }
                }

                // 폭발
                if (isBomb) {
                    strBuild.delete(strBuild.length() - bombLen, strBuild.length());
                }
            }
        }
        if (strBuild.length() == 0) System.out.println("FRULA");
        else System.out.println(strBuild.toString());
    }
}

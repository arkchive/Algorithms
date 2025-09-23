package Baekjoon.Silver.S_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S4_9012_괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());
        for (int i = 0; i < T; i++) {
            List<Character> stack = new ArrayList<>();
            char[] cArr = bufRead.readLine().toCharArray();
            boolean valid = true;

            for (char c : cArr) {
                if (c == '(') {
                    stack.add('(');
                } else {
                    if (stack.isEmpty()) {
                        valid = false;
                        break;
                    } else {
                        stack.remove(stack.size() - 1);
                    }
                }
            }

            if (valid && stack.isEmpty()) {
                strBuild.append("YES\n");
            } else {
                strBuild.append("NO\n");
            }
        }
        System.out.println(strBuild.toString());
    }
}

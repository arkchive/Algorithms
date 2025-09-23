package Baekjoon.Silver.S_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S4_4949_균형잡힌_세상 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        while(true) {
            String line = bufRead.readLine();
            if (line.equals(".")) break;
            
            char[] cArr = line.toCharArray();
            boolean valid = true;
            List<Character> stack = new ArrayList<>();

            for (char c : cArr) {
                if (c == '(' || c == '[') {
                    stack.add(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.get(stack.size() - 1) != '(') {
                        valid = false;
                        break;
                    } else {
                        stack.remove(stack.size() - 1);
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.get(stack.size() - 1) != '[') {
                        valid = false;
                        break;
                    } else {
                        stack.remove(stack.size() - 1);
                    }
                } else {
                    continue;
                }
            }

            if (valid && stack.isEmpty()) {
                strBuild.append("yes\n");
            } else {
                strBuild.append("no\n");
            }
        }
        System.out.println(strBuild.toString());
    }
    
}

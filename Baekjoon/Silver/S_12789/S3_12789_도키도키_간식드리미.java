package Baekjoon.Silver.S_12789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S3_12789_도키도키_간식드리미 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken;

        int N = Integer.parseInt(bufRead.readLine());
        strToken = new StringTokenizer(bufRead.readLine());
        int[] line = new int[N];
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(strToken.nextToken());
        }
        int cnt = 1;
        for (int i : line) {
            if (i == cnt) {
                cnt++;
            } else {
                stack.add(i);
            }

            while (!stack.isEmpty() && stack.get(stack.size() - 1) == cnt) {
                stack.remove(stack.size() - 1);
                cnt++;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
        
    }
    
}

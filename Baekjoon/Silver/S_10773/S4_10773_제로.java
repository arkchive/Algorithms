package Baekjoon.Silver.S_10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S4_10773_제로 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int K = Integer.parseInt(bufRead.readLine());
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(bufRead.readLine());
            if (N == 0) {
                stack.remove(stack.size() - 1);
            } else {
                stack.add(N);
            }
        }

        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        
        System.out.println(sum);
    }
    
}

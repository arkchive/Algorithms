package Baekjoon.Bronze.B_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B5_5597_과제_안_내신_분 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        boolean [] submitted = new boolean[31];
        
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(bufRead.readLine());
            submitted[n] = true;
        }
        
        List<Integer> miss = new ArrayList<>(2);
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) miss.add(i);
        }
        System.out.println(miss.get(0));
        System.out.println(miss.get(1));
    }
    
}

package Baekjoon.Bronze.B_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_8393_합 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufRead.readLine());
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

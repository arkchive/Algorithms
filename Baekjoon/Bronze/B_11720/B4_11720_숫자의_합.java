package Baekjoon.Bronze.B_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_11720_숫자의_합 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());
        int[] arr = new int[N];
        int sum = 0;
        String str = bufRead.readLine();
        for(int i = 0; i < N; i++) {
            arr[i] = str.charAt(i) - '0';
            sum += arr[i];
        }
        System.out.println(sum);
    }
    
}

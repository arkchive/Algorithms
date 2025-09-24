package Baekjoon.Bronze.B_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1_1037_약수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken;

        int N = Integer.parseInt(bufRead.readLine());
        int[] arr = new int[N];
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strToken.nextToken());
        }
        Arrays.sort(arr);
        
        System.out.println(arr[0] * arr[arr.length-1]);
        
    }
    
}

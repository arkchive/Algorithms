package Baekjoon.Bronze.B_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4_2480_주사위_세개 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int a = Integer.parseInt(strToken.nextToken());
        int b = Integer.parseInt(strToken.nextToken());
        int c = Integer.parseInt(strToken.nextToken());

        // if (a == b && b == c) {
        //     System.out.println(10000 + a * 1000);
        // } else if (a == b || a == c) {
        //     System.out.println(1000 + a * 100);
        // } else if (b == c) {
        //     System.out.println(1000 + b * 100);
        // } else {
        //     System.out.println(Math.max(a, Math.max(b, c)) * 100);
        // }

        int [] arr = {a, b, c};
        Arrays.sort(arr);
        if(arr[0] == arr[2]) {
            System.out.println(10000 + arr[0] * 1000);
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(1000 + arr[1] * 100);
        } else {
            System.out.println(arr[2] * 100);
        }


    } // main
    
}

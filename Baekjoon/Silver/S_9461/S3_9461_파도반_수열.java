package Baekjoon.Silver.S_9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_9461_파도반_수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());
        long[] arr = new long[101];

        for (int i = 1; i <= 100; i++) {
            if (i < 4) {
                arr[i] = 1;
            } else if (i < 6) {
                arr[i] = 2;
            } else {
                arr[i] = arr[i-1] + arr[i-5];
            }
        }
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bufRead.readLine());
            strBuild.append(arr[N]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
}

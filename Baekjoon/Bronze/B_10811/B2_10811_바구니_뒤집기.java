package Baekjoon.Bronze.B_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B2_10811_바구니_뒤집기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        List<Integer> arr = new ArrayList<>(N+1);
        for (int k = 0; k <= N; k++) {
            arr.add(k);
            
        }
        for (int k = 0; k < M; k++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int i = Integer.parseInt(strToken.nextToken());
            int j = Integer.parseInt(strToken.nextToken());

            Collections.reverse(arr.subList(i, j+1));
        }
        for (int k = 1; k <= N; k++) {
            System.out.print(arr.get(k) + " ");
        }
    }
}

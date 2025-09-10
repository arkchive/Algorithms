package Baekjoon.Bronze.B_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_10807_개수_세기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());
        int [] arr = new int [N];
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strToken.nextToken());
        }
        int V = Integer.parseInt(bufRead.readLine());

        int cnt = 0;
        for (int j = 0; j < N; j++) {
            if (arr[j] == V) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}

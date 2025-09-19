package Baekjoon.Silver.S_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_10815_숫자_카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        int[] X = new int[N];
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(strToken.nextToken());
        }

        Arrays.sort(X);

        int M = Integer.parseInt(bufRead.readLine());
        int[] Y = new int[M];
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < M; i++) {
            Y[i] = Integer.parseInt(strToken.nextToken());
        }

        for (int y : Y) {
            int pos = Arrays.binarySearch(X, y);
            strBuild.append(pos >= 0 ? 1 : 0).append(' ');
        }
        System.out.println(strBuild.toString());
        
    }
    
}

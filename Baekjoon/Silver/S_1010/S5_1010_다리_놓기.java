package Baekjoon.Silver.S_1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_1010_다리_놓기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken;

        int T = Integer.parseInt(bufRead.readLine());
        
        for (int i = 0; i < T; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int N = Integer.parseInt(strToken.nextToken());
            int M = Integer.parseInt(strToken.nextToken());
            
            strBuild.append(comb(M, N)).append("\n");
        }
        System.out.println(strBuild.toString());
    }

    static long comb(int n, int r) {
        if (r > n - r) r = n - r;
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
    
}

package Baekjoon.Silver.S_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1003_피보나치_함수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());

        int[] dp0 = new int[41];
        int[] dp1 = new int[41];

        dp0[0] = 1; dp1[0] = 0;
        dp0[1] = 0; dp1[1] = 1;

        for (int i = 2; i < 41; i++) {
            dp0[i] = dp0[i-1] + dp0[i-2];
            dp1[i] = dp1[i-1] + dp1[i-2];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bufRead.readLine());
            strBuild.append(dp0[N]).append(" ").append(dp1[N]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
}

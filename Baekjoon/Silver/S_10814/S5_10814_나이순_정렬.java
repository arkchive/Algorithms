package Baekjoon.Silver.S_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S5_10814_나이순_정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        String[][] arrs = new String[N][2];
        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            arrs[i][0] = strToken.nextToken();
            arrs[i][1] = strToken.nextToken();
        }

        Arrays.sort(arrs, (a, b) -> {
            return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
        });

        for (int i = 0; i < N; i++) {
            strBuild.append(arrs[i][0]).append(" ").append(arrs[i][1]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

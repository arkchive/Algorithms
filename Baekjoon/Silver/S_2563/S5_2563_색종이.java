package Baekjoon.Silver.S_2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class S5_2563_색종이 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        int N = Integer.parseInt(bufRead.readLine());

        boolean[][] paper = new boolean[100][100];
            
        
        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int x = Integer.parseInt(strToken.nextToken());
            int y = Integer.parseInt(strToken.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                } // for -k
            } // for - j
        } // for - i

        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) area++;
            } // for - j
        } // for - i

        System.out.println(area);
    }
}

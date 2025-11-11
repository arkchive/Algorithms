package Baekjoon.Silver.S_2578;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_2578_빙고 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int[][] board = new int[5][5];
        int[] posR = new int[26];
        int[] posC = new int[26];
        Arrays.fill(posR, -1);
        Arrays.fill(posC, -1);

        for (int r = 0; r < 5; r++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int c = 0; c < 5; c++) {
                int v = Integer.parseInt(strToken.nextToken());
                board[r][c] = v;
                posR[v] = r;
                posC[v] = c;
            }
        }

        int[] calls = new int[25];
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < 5; j++) {
                calls[idx] = Integer.parseInt(strToken.nextToken());
                idx++;
            }
        }

        int[] rowCnt = new int[5];
        int[] colCnt = new int[5];
        int diagMain = 0;
        int diagAnti = 0;
        int bingoLines = 0;

        for (int callOrder = 0; callOrder < 25; callOrder++) {
            int num = calls[callOrder];
            int r = posR[num];
            int c = posC[num];
            
            if (++rowCnt[r] == 5) bingoLines++;
            if (++colCnt[c] == 5) bingoLines++;
            if (r == c && ++diagMain == 5) bingoLines++;
            if (r + c == 4 && ++diagAnti == 5) bingoLines++;

            if (bingoLines >= 3) {
                System.out.println(callOrder + 1);
                return;
            }
        }
    }
}

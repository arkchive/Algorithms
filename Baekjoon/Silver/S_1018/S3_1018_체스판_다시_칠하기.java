package Baekjoon.Silver.S_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1018_체스판_다시_칠하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = bufRead.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            } // for - j
        } // for - i

        int answer = 64;
        for (int r = 0; r <= N-8; r++) {
            for (int c = 0; c <= M-8; c++) {
                int repaintW = 0; // (r,c)가 'W'로 시작
                int repaintB = 0; // (r,c)가 'B'로 시작
                
                for(int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char cur = board[r+i][c+j];
                        char expectW = ((i + j) % 2 == 0) ? 'W' : 'B';
                        char expectB = ((i + j) % 2 == 0) ? 'B' : 'W';

                        if (cur != expectW) repaintW++;
                        if (cur != expectB) repaintB++;
                    }
                }
                answer = Math.min(answer, Math.min(repaintW, repaintB));
            }
        }
        System.out.println(answer);
    }
    
}

package Baekjoon.Silver.S_1051;

import java.util.Scanner;

public class S3_1051_숫자_정사각형 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = scan.next();
            board[i] = line.toCharArray();
        }

        int max = (N <= M) ? N-1 : M-1;

        while (max != 0) {
            for (int i = 0; i + max < N; i++) {
                for (int j = 0; j + max < M; j++) {
                    char a = board[i][j];
                    char b = board[i][j+max];
                    char c = board[i+max][j];
                    char d = board[i+max][j+max];

                    if (a == b && b == c && c == d) {
                        int length = max + 1;
                        System.out.println(length * length);
                        return;
                    }
                }
            }
            max--;
        }
        System.out.println(1);
    }
}

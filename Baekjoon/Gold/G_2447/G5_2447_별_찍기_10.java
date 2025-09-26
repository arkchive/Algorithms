package Baekjoon.Gold.G_2447;

import java.util.Arrays;
import java.util.Scanner;

public class G5_2447_별_찍기_10 {
    static char[][] board;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        int N = scan.nextInt();
        board = new char[N][N];

        for (int i = 0; i < N; i++) Arrays.fill(board[i], ' ');

        draw(0, 0, N, false);

        for (int i = 0; i < N; i++) {
            strBuild.append(board[i]).append('\n');
        }
        System.out.println(strBuild.toString());
    }

    static void draw(int x, int y, int n, boolean blank) {
        if (blank) {
            for (int i = x; i < x + n; i++) {
                Arrays.fill(board[i], y, y+n, ' ');
            }
            return;
        }
        if (n == 1) {
            board[x][y] = '*';
            return;
        }

        int s = n / 3;
        int cnt = 0;
        for (int dx = 0; dx < 3; dx++) {
            for (int dy = 0; dy < 3; dy++) {
                boolean nextBlank = (++cnt == 5);
                draw(x + dx * s, y + dy * s, s, nextBlank);
            }
        }

    }
    
}

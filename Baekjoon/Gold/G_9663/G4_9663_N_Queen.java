package Baekjoon.Gold.G_9663;

import java.util.Scanner;

public class G4_9663_N_Queen {
    static int N;
    static int[] col;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        col = new int[N];
        backtrack(0);
        System.out.println(count);
    }

    static void backtrack(int row) {
        if (row == N) {
            count++;
            return;
        }

        for (int c = 0; c < N; c++) {
            if (isPossible(row, c)) {
                col[row] = c;
                backtrack(row+1);
            }
        }
    }

    static boolean isPossible(int row, int c) {
        for (int i = 0; i < row; i++) {
            if (col[i] == c) return false;
            if(Math.abs(row - i) == Math.abs(col[i] - c)) return false;
        }
        return true;
    }
    
}

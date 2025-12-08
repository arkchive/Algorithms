package Baekjoon.Gold.G_1987;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G4_1987_알파벳 {
    static int R, C;
    static char[][] board;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean[] visited = new boolean[26];
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        R = Integer.parseInt(strToken.nextToken());
        C = Integer.parseInt(strToken.nextToken());
        board = new char[R][C];
        
        for (int i = 0; i < R; i++) {
            board[i] = bufRead.readLine().toCharArray();
        }

        visited[board[0][0] - 'A'] = true;
        dfs(0, 0, 1);
        System.out.println(max);
    }

    static void dfs(int r, int c, int depth) {
        max = Math.max(max, depth);

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nc < 0 || nr >= R || nc >= C) continue;
            
            int alphabet = board[nr][nc] - 'A';
            if (visited[alphabet]) continue;

            visited[alphabet] = true;
            dfs(nr, nc, depth + 1);
            visited[alphabet] = false;
        }
    }
}

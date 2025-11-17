package Baekjoon.Silver.S_21736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_21736_헌내기는_친구가_필요해 {
    static int N, M;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static char[][] campus;
    static boolean[][] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        N = Integer.parseInt(strToken.nextToken());
        M = Integer.parseInt(strToken.nextToken());

        campus = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = bufRead.readLine();
            campus[i] = line.toCharArray();
        }

        int startX = -1, startY = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (campus[i][j] == 'I') {
                    startX = i;
                    startY = j;                    
                }
            }
        }

        dfs(startX, startY);
        System.out.println(count == 0 ? "TT" : count);

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        if (campus[x][y] == 'P') count++;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if (visited[nx][ny]) continue;
            if (campus[nx][ny] == 'X') continue;

            dfs(nx, ny);
        }
    }
}

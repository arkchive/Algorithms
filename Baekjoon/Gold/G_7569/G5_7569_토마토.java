package Baekjoon.Gold.G_7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class G5_7569_토마토 {
    static int M, N, H;
    static int[][][] box, day;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        M = Integer.parseInt(strToken.nextToken());
        N = Integer.parseInt(strToken.nextToken());
        H = Integer.parseInt(strToken.nextToken());

        box = new int[H][N][M];
        day = new int[H][N][M];

        Deque<int[]> q = new ArrayDeque<>();

        for (int z = 0; z < H; z++) {
            for (int x = 0; x < N; x++) {
                strToken = new StringTokenizer(bufRead.readLine());
                for (int y = 0; y < M; y++) {
                    box[z][x][y] = Integer.parseInt(strToken.nextToken());
                    if (box[z][x][y] == 1) {
                        q.addLast(new int[]{z, x, y});
                        day[z][x][y] = 0;
                    }
                }
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.pollFirst();
            int z = cur[0], x = cur[1], y = cur[2];

            for (int d = 0; d < 6; d++) {
                int nz = z + dz[d];
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nz < 0 || nx < 0 || ny < 0 || nz >= H || nx >= N || ny >= M) continue;

                if (box[nz][nx][ny] != 0) continue;

                box[nz][nx][ny] = 1;
                day[nz][nx][ny] = day[z][x][y] + 1;
                q.addLast(new int[]{nz, nx, ny});
            }
        }

        int ans = 0;
        for (int z = 0; z < H; z++) {
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (box[z][x][y] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    ans = Math.max(ans, day[z][x][y]);
                }
            }
        }
        System.out.println(ans);
    }
}

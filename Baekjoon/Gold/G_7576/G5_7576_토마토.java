package Baekjoon.Gold.G_7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class G5_7576_토마토 {
    static int M, N;
    static int[][] box, day;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        M = Integer.parseInt(strToken.nextToken());
        N = Integer.parseInt(strToken.nextToken());
        box = new int[N][M];
        day = new int[N][M];

        Deque<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(strToken.nextToken());
                if (box[i][j] == 1) {
                    q.addLast(new int[]{i, j});
                    day[i][j] = 0;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.pollFirst();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                if (box[nx][ny] != 0) continue;

                box[nx][ny] = 1;
                day[nx][ny] = day[x][y] + 1;
                q.addLast(new int[]{nx, ny});
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                ans = Math.max(ans, day[i][j]);
            }
        }
        System.out.println(ans);
    }
}

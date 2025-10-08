package Baekjoon.Silver.S_2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_2178_미로_탐색_2 {
    static int N, M;
    static int[][] maze;
    static int[][] dist;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        N = Integer.parseInt(strToken.nextToken());
        M = Integer.parseInt(strToken.nextToken());

        maze = new int[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = bufRead.readLine();
            for(int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));
    }
    static int bfs(int sx, int sy) {
        if (maze[sx][sy] == 0) return 0;

        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{sx, sy});
        dist[sx][sy] = 1;

        while(!que.isEmpty()) {
            int[] cur = que.poll();
            int cx = cur[0], cy = cur[1];

            if (cx == N-1 && cy == M-1) return dist[cx][cy];

            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(maze[nx][ny] == 0) continue;
                if(dist[nx][ny] != 0) continue;

                dist[nx][ny] = dist[cx][cy] + 1;
                que.offer(new int[]{nx, ny});
            }
        }
        return 0;
    }
}

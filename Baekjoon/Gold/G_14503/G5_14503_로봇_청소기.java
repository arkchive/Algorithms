package Baekjoon.Gold.G_14503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G5_14503_로봇_청소기 {

    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        N = Integer.parseInt(strToken.nextToken());
        M = Integer.parseInt(strToken.nextToken());

        strToken = new StringTokenizer(bufRead.readLine());
        int r = Integer.parseInt(strToken.nextToken());
        int c = Integer.parseInt(strToken.nextToken());
        int dir = Integer.parseInt(strToken.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(strToken.nextToken());
            }
        }

        int cleaned = 0;

        while (true) {

            // 1. 현재 칸 청소
            if (!visited[r][c]) {
                visited[r][c] = true;
                cleaned++;
            }

            boolean moved = false;

            // 2. 네 방향 탐색
            for (int i = 0; i < 4; i++) {
                dir = (dir + 3) % 4; // 왼쪽 회전
                int nr = r + dr[dir];
                int nc = c + dc[dir];

                if (map[nr][nc] == 0 && !visited[nr][nc]) {
                    r = nr;
                    c = nc;
                    moved = true;
                    break;
                }
            }

            // 3. 네 방향 다 못 갔을 경우
            if (!moved) {
                int backDir = (dir + 2) % 4;
                int br_ = r + dr[backDir];
                int bc_ = c + dc[backDir];

                if (map[br_][bc_] == 1) break; // 뒤가 벽이면 종료
                r = br_;
                c = bc_;
            }
        }

        System.out.println(cleaned);
    }
}

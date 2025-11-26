package Baekjoon.Silver.S_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_1012_유기농_배추 {
    static int T, M, N, K;
    static StringBuilder strBuild = new StringBuilder();
    static int[] dx = {1, -1, 0, 0}; // x: 좌우
    static int[] dy = {0, 0, 1, -1}; // y: 상하
    static int[][] field;
    static boolean[][] visited;
    static int wormCount;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        T = Integer.parseInt(bufRead.readLine());

        // 테스트 케이스 만큼 반복
        for (int t = 0; t < T; t++) {
            strToken = new StringTokenizer(bufRead.readLine());
            M = Integer.parseInt(strToken.nextToken()); // 가로 길이
            N = Integer.parseInt(strToken.nextToken()); // 세로 길이
            K = Integer.parseInt(strToken.nextToken()); // 배추 위치 개수

            field = new int[N][M];
            visited = new boolean[N][M];

            // 배추 위치 개수 만큼 반복
            for (int i = 0; i < K; i++) {
                strToken = new StringTokenizer(bufRead.readLine());
                int X = Integer.parseInt(strToken.nextToken()); // 열
                int Y = Integer.parseInt(strToken.nextToken()); // 행
                field[Y][X] = 1;
            }

            wormCount = 0;

            // 전체 밭 탐색
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (field[y][x] == 1 && !visited[y][x]) {
                        dfs(y, x);
                        wormCount++;
                    }
                }
            } 
            strBuild.append(wormCount).append('\n');
        }
        System.out.println(strBuild.toString());
    }

    // DFS로 배추가 연결된 모든 위치 방문 처리
    static void dfs(int y, int x) {
        visited[y][x] = true;

        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if (ny < 0 || ny >= N || nx < 0 || nx >= M) continue;

            if (field[ny][nx] == 1 && !visited[ny][nx]) {
                dfs(ny, nx);
            }
        }
    }
}

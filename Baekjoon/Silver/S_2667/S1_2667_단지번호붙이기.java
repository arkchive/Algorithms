package Baekjoon.Silver.S_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class S1_2667_단지번호붙이기 {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static ArrayList<Integer> sizes;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bufRead.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        sizes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = bufRead.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int size = dfs(i, j);
                    sizes.add(size);
                }
            }
        }

        Collections.sort(sizes);
        System.out.println(sizes.size());
        for (int size : sizes) {
            System.out.println(size);
        }
    }

    static int dfs(int x, int y) {
        visited[x][y] = true;
        int cnt = 1;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    cnt += dfs(nx, ny);
                }
            }
        }
        return cnt;
    }
}

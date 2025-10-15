package Baekjoon.Silver.S_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class S1_2667_단지번호붙이기_2 {
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
                    int size = bfs(i, j);
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

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        int cnt = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        cnt++;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return cnt;
    }
}

package Baekjoon.Gold.G_10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G5_10026_적록색약 {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int normal, blind;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        N = Integer.parseInt(bufRead.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = bufRead.readLine();
            map[i] = line.toCharArray();
        }

        normal = 0; blind = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, map[i][j]);
                    normal++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'G') map[i][j] = 'R';
            }
        }

        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j , map[i][j]);
                    blind++;
                }
            }
        }
        strBuild.append(normal).append(" ").append(blind);
        System.out.println(strBuild.toString());
    }

    static void dfs(int x, int y, char color) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] == color) {
                    dfs(nx, ny, color);
                }
            }
        }
    }
}

package Baekjoon.Silver.S_7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_7562_나이트의_이동 {

    static int T, I;
    static int curR, curC;
    static int targetR, targetC;
    static int answer;
    static int[] dr = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dc = {-1, 1, -2, 2, -2, 2, -1, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;
        T = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < T; i++) {
            I = Integer.parseInt(bufRead.readLine());
            visited = new boolean[I][I];

            strToken = new StringTokenizer(bufRead.readLine());
            curR = Integer.parseInt(strToken.nextToken());
            curC = Integer.parseInt(strToken.nextToken());

            strToken = new StringTokenizer(bufRead.readLine());
            targetR = Integer.parseInt(strToken.nextToken());
            targetC = Integer.parseInt(strToken.nextToken());

            if(curR == targetR && curC == targetC){
                strBuild.append(0).append("\n");
                continue;
            }

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{curR, curC, 0});
            visited[curR][curC] = true;

            answer = 0;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];
                int cnt = cur[2];

                for (int k = 0; k < 8; k++) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];

                    if (nr < 0 || nc < 0 || nr >= I || nc >= I) continue;
                    if (visited[nr][nc]) continue;

                    if (nr == targetR && nc == targetC) {
                        answer = cnt + 1;
                        queue.clear();
                        break;
                    }

                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, cnt+1});
                }
            }
            strBuild.append(answer).append('\n');
        }
        System.out.println(strBuild.toString());
    }
}

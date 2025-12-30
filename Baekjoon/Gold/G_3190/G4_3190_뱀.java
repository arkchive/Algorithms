package Baekjoon.Gold.G_3190;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class G4_3190_뱀 {

    static int N, K, L;
    static int[][] board;
    static boolean[][] visited;
    static Deque<Point> snake = new ArrayDeque<>();
    static Queue<Turn> turns = new ArrayDeque<>();
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int dir = 0; 
    
    static class Point {
        int r, c;
        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static class Turn {
        int time;
        char dir;
        Turn(int time, char dir) {
            this.time = time;
            this.dir = dir;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        N = Integer.parseInt(bufRead.readLine());
        board = new int[N][N];
        visited = new boolean[N][N];

        K = Integer.parseInt(bufRead.readLine());

        for (int i = 0; i < K; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int r = Integer.parseInt(strToken.nextToken()) - 1;
            int c = Integer.parseInt(strToken.nextToken()) - 1;
            board[r][c] = 1;
        }

        L = Integer.parseInt(bufRead.readLine());
        
        for (int i = 0; i < L; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            int time = Integer.parseInt(strToken.nextToken());
            char dir = strToken.nextToken().charAt(0);
            turns.add(new Turn(time, dir));
        }
        
        snake.add(new Point(0, 0));
        visited[0][0] = true;
        
        int time = 0;

        while (true) {
            time++;

            Point head = snake.peekFirst();
            int nr = head.r + dr[dir];
            int nc = head.c + dc[dir];

            // 벽 또는 자기 몸 충돌
            if (nr < 0 || nr >= N || nc < 0 || nc >= N || visited[nr][nc]) {
                break;
            }

            // 머리 이동
            snake.addFirst(new Point(nr, nc));
            visited[nr][nc] = true;

            // 사과 처리
            if (board[nr][nc] == 1) {
                board[nr][nc] = 0; // 사과 먹음, 꼬리 유지
            } else {
                // 꼬리 제거
                Point tail = snake.removeLast();
                visited[tail.r][tail.c] = false;
            }

            // 방향 전환
            if (!turns.isEmpty() && turns.peek().time == time) {
                Turn t = turns.poll();
                if (t.dir == 'D') dir = (dir + 1) % 4;
                else dir = (dir + 3) % 4;
            }
        }

        System.out.println(time);
    }
}
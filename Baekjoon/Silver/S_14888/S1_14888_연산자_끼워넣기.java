package Baekjoon.Silver.S_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_14888_연산자_끼워넣기 {
    static int N;
    static int[] A;
    static char[] op;
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = null;

        N = Integer.parseInt(bufRead.readLine());
        A = new int[N];
        op = new char[N-1];
        
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strToken.nextToken());
        }

        int idx = 0;
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < 4; i++) {
            int cnt = Integer.parseInt(strToken.nextToken());
            while (cnt != 0) {
                switch (i) {
                    case 0:
                        op[idx++] = '+';
                        break;
                    case 1:
                        op[idx++] = '-';
                        break;
                    case 2:
                        op[idx++] = '*';
                        break;
                    case 3:
                        op[idx++] = '/';
                        break;
                }
                cnt--;
            }
        }

        visited = new boolean[N-1];
        dfs(0, A[0]);

        strBuild.append(max).append('\n');
        strBuild.append(min);
        System.out.println(strBuild.toString());
    }

    static void dfs(int depth, int currentValue) {
        if (depth == N - 1) {
            max = Math.max(max, currentValue);
            min = Math.min(min, currentValue);
            return;
        }

        for (int i = 0; i < N-1; i++) {
            if (!visited[i]) {
                visited[i] = true;

                int next = calc(currentValue, A[depth + 1], op[i]);
                dfs(depth + 1, next);

                visited[i] = false;
            }
        }
    }

    static int calc(int a, int b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (a < 0) return -(Math.abs(a) / b);
                return a / b;
        }
        return 0;
    }
}

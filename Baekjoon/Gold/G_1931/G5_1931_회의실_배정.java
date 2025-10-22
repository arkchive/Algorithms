package Baekjoon.Gold.G_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G5_1931_회의실_배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());
        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            meetings[i][0] = Integer.parseInt(strToken.nextToken());
            meetings[i][1] = Integer.parseInt(strToken.nextToken());
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int cnt = 0; 
        int lastEnd = 0; 

        for (int[] m : meetings) {
            if (m[0] >= lastEnd) {
                lastEnd = m[1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

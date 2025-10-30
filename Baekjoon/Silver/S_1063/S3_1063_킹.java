package Baekjoon.Silver.S_1063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1063_킹 {
    static int kx, ky, sx, sy;
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        int[] king = getLoc(strToken.nextToken());
        int[] stone = getLoc(strToken.nextToken());
        int N = Integer.parseInt(strToken.nextToken());

        kx = king[0];
        ky = king[1];
        sx = stone[0];
        sy = stone[1];

        for (int i = 0 ; i < N; i++) {
            String move = bufRead.readLine();
            int dx = 0, dy = 0;

            switch (move) {
                case "R":
                    dx = 1; dy = 0; 
                    break;
                case "L":
                    dx = -1; dy = 0;
                    break;
                case "B":
                    dx = 0; dy = 1;
                    break;
                case "T":
                    dx = 0; dy = -1;
                    break;
                case "RT":
                    dx = 1; dy = -1;
                    break;
                case "LT":
                    dx = -1; dy = -1;
                    break;
                case "RB":
                    dx = 1; dy = 1;
                    break;
                case "LB":
                    dx = -1; dy = 1;
                    break;
                default:
                    break;
            }

            int nkx = kx + dx, nky = ky + dy;
            if (!isValid(nkx, nky)) continue;

            if (nkx == sx && nky == sy) {
                if (!isValid(sx+dx, sy+dy)) continue;
                sx += dx;
                sy += dy;
            }
            
            kx = nkx;
            ky = nky;
            
        }
        strBuild.append(printLoc(new int[]{kx, ky})).append('\n');
        strBuild.append(printLoc(new int[]{sx, sy})).append('\n');

        System.out.println(strBuild.toString());
    }

    static int[] getLoc(String loc) {
        char[] charLoc = loc.toCharArray();
        int col = (charLoc[0] - 'A' + 1);
        int row = 9 - ((int)charLoc[1] - '0');
        return new int[]{col, row};
    }
    
    static String printLoc(int[] loc) {
        char col = (char)(loc[0] - 1 + 'A');
        char row = (char)((9 - loc[1]) + '0');
        return String.valueOf(col) + row;
    }

    static boolean isValid(int x, int y) {
        if (x < 1 || y < 1) return false;
        if (x > 8 || y > 8) return false;
        return true;
    }
}

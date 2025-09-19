package Baekjoon.Silver.S_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S5_10815_숫자_카드_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        strToken = new StringTokenizer(bufRead.readLine());
        Set<Integer> have = new HashSet<>(N*2);
        for (int i = 0; i < N; i++) {
            have.add(Integer.parseInt(strToken.nextToken()));
        }

        int M = Integer.parseInt(bufRead.readLine());
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < M; i++) {
            int q = Integer.parseInt(strToken.nextToken());
            strBuild.append(have.contains(q) ? 1 : 0).append(' ');
        }
        System.out.println(strBuild);
    }
    
}

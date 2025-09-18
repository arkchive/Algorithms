package Baekjoon.Bronze.B_25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B2_25305_커트라인 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int k = Integer.parseInt(strToken.nextToken());

        ArrayList<Integer> scores = new ArrayList<>();
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            scores.add(Integer.parseInt(strToken.nextToken()));
        }
        Collections.sort(scores, Collections.reverseOrder());
        System.out.println(scores.get(k-1));
    }
    
}

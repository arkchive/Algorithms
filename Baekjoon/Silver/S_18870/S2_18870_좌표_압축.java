package Baekjoon.Silver.S_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S2_18870_좌표_압축 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        int[] arr = new int[N];
        strToken = new StringTokenizer(bufRead.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strToken.nextToken());
        }

        int[] sorted = Arrays.copyOf(arr, N);
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>(N*2);
        int idx = 0;
        for (int x : sorted) {
            if (!rank.containsKey(x)) {
                rank.put(x, idx++);
            }
        }

        for (int i = 0; i < N; i++) {
            strBuild.append(rank.get(arr[i])).append(" ");
        }
        System.out.println(strBuild.toString());
    }
    
}

package Baekjoon.Silver.S_11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class S4_11652_카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long answer = Long.MAX_VALUE;
        int maxCnt = 0;

        for (Map.Entry<Long, Integer> e : map.entrySet()) {
            long key = e.getKey();
            int cnt = e.getValue();

            if (cnt > maxCnt || (cnt == maxCnt && key < answer)) {
                maxCnt = cnt;
                answer = key;
            }
        }
        System.out.println(answer);
    }
}

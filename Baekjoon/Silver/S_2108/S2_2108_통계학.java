package Baekjoon.Silver.S_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S2_2108_통계학 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());
        int[] arr = new int[N];
        int sum = 0; 

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(bufRead.readLine());
            arr[i] = X;
            sum += X;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        
        int maxCount = Collections.max(freq.values());
        List<Integer> candidates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if (entry.getValue() == maxCount) {
                candidates.add(entry.getKey());
            }
        }

        Collections.sort(candidates);
        int mode = (candidates.size() > 1) ? candidates.get(1) : candidates.get(0);

        Arrays.sort(arr);
        int mean = (int)Math.round((double)sum / N);
        int median = arr[N / 2];
        int range = arr[N-1] - arr[0];

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
    
}

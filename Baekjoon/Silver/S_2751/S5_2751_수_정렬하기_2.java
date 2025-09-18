package Baekjoon.Silver.S_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S5_2751_수_정렬하기_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufRead.readLine());

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(bufRead.readLine());
        }
        Arrays.sort(nums);

        for (int i = 0; i < N; i++) {
            System.out.println(nums[i]);
        }
    }
    
}

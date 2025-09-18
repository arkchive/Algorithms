package Baekjoon.Bronze.B_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1_10989_수_정렬하기_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        int N = Integer.parseInt(bufRead.readLine());

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(bufRead.readLine());
        }
        Arrays.sort(nums);
        for (int i = 0; i < N; i++) {
            strBuild.append(nums[i]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

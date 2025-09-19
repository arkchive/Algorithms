package Baekjoon.Silver.S_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class S5_1427_소트인사이드 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        String N = bufRead.readLine();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N.length(); i++) {
            nums.add(N.charAt(i) - '0');
        }
        Collections.sort(nums, Collections.reverseOrder());
        for (int i = 0; i < N.length(); i++) {
            strBuild.append(nums.get(i));
        }
        System.out.println(strBuild.toString());
    }
    
}

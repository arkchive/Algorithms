package Baekjoon.Bronze.B_3040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_3040_백설공주와_일곱난쟁이 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        
        int [] arr = new int [9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(bufRead.readLine());
            sum += arr[i];
        }

        int target = sum - 100;
        int x = -1, y = -1;

        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {
                if (arr[i] + arr[j] == target) {
                    x = i; y = j;
                    break outer;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == x || i == y) continue;
            strBuild.append(arr[i]).append("\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

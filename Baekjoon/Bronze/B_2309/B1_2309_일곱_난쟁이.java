package Baekjoon.Bronze.B_2309;

import java.util.Arrays;
import java.util.Scanner;

public class B1_2309_일곱_난쟁이 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();

        int total = 0;
        int[] heights = new int[9];
        for (int i = 0; i < 9; i++) {
            heights[i] = scan.nextInt();
            total += heights[i];
        }
        Arrays.sort(heights);

        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {
                int first = heights[i];
                int second = heights[j];

                int sum = total - first - second;
                if (sum == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            strBuild.append(heights[k]).append('\n');
                        }
                    }
                    System.out.println(strBuild.toString());
                    return;
                }
            }
        }
    }
}

package Baekjoon.Bronze.B_2798;

import java.util.ArrayList;
import java.util.Scanner;

public class B2_2798_블랙잭 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0 ; i < N; i++) {
            arr.add(scan.nextInt());
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr.get(i) + arr.get(j) + arr.get(k);
                    if (sum <= M && sum > max) max = sum;
                }
            }
        }
        System.out.println(max);
        scan.close();
    }
}

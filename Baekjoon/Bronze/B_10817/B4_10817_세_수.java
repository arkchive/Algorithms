package Baekjoon.Bronze.B_10817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B4_10817_세_수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(scan.nextInt());
        }

        Collections.sort(arr);
        System.out.println(arr.get(1));
    }
}

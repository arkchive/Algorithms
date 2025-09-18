package Baekjoon.Bronze.B_2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B2_2750_수_정렬하기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> nums = new ArrayList();
        for (int i = 0; i < N; i++) {
            nums.add(scan.nextInt());
        }
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}

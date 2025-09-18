package Baekjoon.Bronze.B_2587;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B2_2587_대표값2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            nums.add(scan.nextInt());
            sum += nums.get(i);
        }
        Collections.sort(nums);
        System.out.println(sum / 5);
        System.out.println(nums.get(2));
    }
    
}

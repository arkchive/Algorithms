package Baekjoon.Bronze.B_3052;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B2_3052_나머지 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        // Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int A = scan.nextInt();
            arr[i] = A % 42;
            // set.add(A % 42);
        }
        
        System.out.println(Arrays.stream(arr).distinct().count());
        // System.out.println(set.size());
        scan.close();
    }
    
}

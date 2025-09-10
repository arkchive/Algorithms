package Baekjoon.Bronze.B_3040;

import java.io.IOException;
import java.util.Scanner;

public class B2_3040_백설공주와_일곱난쟁이_2 {

    static int N = 9, R = 7; // N은 모수, R은 추출할 갯수
    static int[] input = new int[N]; // 모수를 저장하는 배열
    static int[] number = new int[R]; // 추출 결과를 저장하는 배열
    static boolean found = false;
    

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            input[i] = scan.nextInt();
        } // for

        combination(0, 0, 0);    
        scan.close();    
    }

    private static void combination(int idx, int start, int sum) {
        if (found) return;

        if (sum > 100) return;

        if (idx == R) {
            if (sum == 100) {
                for (int i = 0; i < R; i++) {
                    System.out.println(number[i]);
                }
                found = true;
            }
            return;
        }

        for (int i = start; i < N; i++) {
            number[idx] = input[i];
            combination(idx + 1, i + 1, sum + input[i]);
        }
    }
}

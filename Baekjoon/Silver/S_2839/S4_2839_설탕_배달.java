package Baekjoon.Silver.S_2839;

import java.util.Scanner;

public class S4_2839_설탕_배달 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int answer = Integer.MAX_VALUE;
        for (int x = 0; x <= N/5; x++) {
            int rest = N - 5 * x;
            if (rest % 3 == 0) {
                int y = rest / 3;
                answer = Math.min(answer, x + y);
            }
        }
        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
        scan.close();
    }
    
}

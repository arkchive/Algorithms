package Baekjoon.Bronze.B_1978;

import java.io.IOException;
import java.util.Scanner;

public class B2_1978_소수_찾기 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int cnt = 0;
        for(int i = 0; i < N; i++) {
            int n = scan.nextInt();
            if (isPrime(n)) {
                cnt++;
            }
        } // for - i
        System.out.println(cnt);
        scan.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
    
}

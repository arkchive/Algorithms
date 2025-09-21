package Baekjoon.Silver.S_1929;

import java.util.Scanner;

public class S3_1929_소수_구하기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();
        int M = scan.nextInt();
        int N = scan.nextInt();

        for (int i = M; i <= N; i++) {
            if(!isPrime(i)) continue;
            else strBuild.append(i).append("\n");
        }
        System.out.println(strBuild.toString());
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) 
            return false;
        }
        return true;
    }
    
}

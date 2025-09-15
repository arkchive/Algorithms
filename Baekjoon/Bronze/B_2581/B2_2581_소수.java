package Baekjoon.Bronze.B_2581;

import java.util.ArrayList;
import java.util.Scanner;

public class B2_2581_소수 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();

        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }

        int sum = 0;
        if (!prime.isEmpty()) {
            for (int i = 0; i < prime.size(); i++) {
                sum += prime.get(i);
            }
            System.out.println(sum);
            System.out.println(prime.get(0));
        } else {
            System.out.println(-1);
        }
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


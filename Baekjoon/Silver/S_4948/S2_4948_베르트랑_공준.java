package Baekjoon.Silver.S_4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_4948_베르트랑_공준 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        
        while (true) {
            int n = Integer.parseInt(bufRead.readLine());
            if (n == 0) break;

            int cnt = 0;
            for (int i = n+1; i <= 2*n; i++) {
                if(!isPrime(i)) continue;
                else cnt++;
            }
            strBuild.append(cnt).append("\n");
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

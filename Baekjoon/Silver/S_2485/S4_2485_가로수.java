package Baekjoon.Silver.S_2485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_2485_가로수 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bufRead.readLine());

        int[] arr = new int[N];
        int g = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufRead.readLine());
            if (i == 0) {
                continue;
            }
            g = gcd(g, arr[i] - arr[i-1]);
        }

        int cnt = 0;
        for (int i = 1; i < N; i++) {
            cnt += (arr[i] - arr[i-1]) / g - 1;
        }
        System.out.println(cnt);
    }

    private static int gcd(int a, int b) {
        while(b != 0) {
            int term = a % b;
            a = b;
            b = term;
        }
        return a;
    }
    
}

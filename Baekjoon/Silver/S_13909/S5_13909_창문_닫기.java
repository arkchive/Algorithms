package Baekjoon.Silver.S_13909;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_13909_창문_닫기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(bufRead.readLine());
        System.out.println((long)Math.sqrt(N));
    }
}

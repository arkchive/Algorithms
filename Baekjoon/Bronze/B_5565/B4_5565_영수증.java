package Baekjoon.Bronze.B_5565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_5565_영수증 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(bufRead.readLine());
        for (int i = 0; i < 9; i++) {
            int price = Integer.parseInt(bufRead.readLine());
            total -= price;
        }
        System.out.println(total);
    }
}

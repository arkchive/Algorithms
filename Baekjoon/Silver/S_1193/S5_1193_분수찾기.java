package Baekjoon.Silver.S_1193;

import java.util.Scanner;

public class S5_1193_분수찾기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();

        int layer = 1;
        int max = 1;
        while (X > max) {
            layer++;
            max += layer;
        }

        int prev = max - layer;
        int diff = X - prev;

        int num, den;   // 분자, 분모
        if (layer % 2 == 0) {
            num = diff;
            den = layer - diff + 1;
        } else {
            num = layer - diff + 1;
            den = diff;
        }
        System.out.println(num + "/" + den);
        scan.close();
    }
    
}

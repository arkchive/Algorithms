package Baekjoon.Gold.G_11729;

import java.util.Scanner;

public class G5_11729_하노이_탑_이동_순서 {

    static StringBuilder strBuild = new StringBuilder();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        long moves = (long)Math.pow(2, N) - 1;
        strBuild.append(moves).append('\n');

        hanoi(N, 1, 3, 2);
        System.out.println(strBuild.toString());

    }

    static void hanoi(int n, int from, int to, int aux) {
        if (n == 0) return;
        hanoi(n-1, from, aux, to);
        strBuild.append(from).append(' ').append(to).append('\n');
        hanoi(n-1, aux, to, from);
    }
    
}

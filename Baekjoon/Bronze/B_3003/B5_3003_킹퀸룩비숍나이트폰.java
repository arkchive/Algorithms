package Baekjoon.Bronze.B_3003;

import java.io.IOException;
import java.util.Scanner;

public class B5_3003_킹퀸룩비숍나이트폰 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();

        int[] total = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            strBuild.append(total[i] - scan.nextInt()).append(" ");
        }
        System.out.println(strBuild.toString().trim());

        scan.close();
    }
    
}

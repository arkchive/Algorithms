package Baekjoon.Bronze.B_14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_14681_사분면_고르기 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufRead.readLine());
        int y = Integer.parseInt(bufRead.readLine());

        if (x > 0) {
            if (y > 0) System.out.println(1);
            else System.out.println(4);
        } else {
            if (y > 0) System.out.println(2);
            else System.out.println(3);
        }
            
    }
}

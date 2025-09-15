package Baekjoon.Bronze.B_9506;

import java.util.ArrayList;
import java.util.Scanner;

public class B1_9506_약수들의_합 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();

        while(true) {
            int n = scan.nextInt();
            if (n == -1) {
                break;
            }
            
            int sum = 0;
            ArrayList<Integer> divisors = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }
            if (n == sum) {
                strBuild.append(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    if (i == divisors.size() - 1) {
                        strBuild.append(divisors.get(i)).append("\n");
                    } else {
                        strBuild.append(divisors.get(i)).append(" + ");
                    }
                }
            } else {
                strBuild.append(n + " is NOT perfect.\n");
            }

        }
        System.out.println(strBuild.toString());
        scan.close();
    }
    
}

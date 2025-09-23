package Baekjoon.Silver.S_28278;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S4_28278_스택_2 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder();


        int N = scan.nextInt();
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int command = scan.nextInt();
            
            switch (command) {
                case 1:
                    int X = scan.nextInt();
                    stack.add(X);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        int last = stack.size() - 1;
                        strBuild.append(stack.get(last)).append("\n");
                        stack.remove(last);
                    }
                    break;
                case 3:
                    strBuild.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        strBuild.append(1).append("\n");
                    } else {
                        strBuild.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        strBuild.append(-1).append("\n");
                    } else {
                        int last = stack.size() - 1;
                        strBuild.append(stack.get(last)).append("\n");
                    }
                    break;
            }
        }
        System.out.println(strBuild.toString());
    }
    
}

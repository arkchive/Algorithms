package Baekjoon.Silver.S_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S2_1541_잃어버린_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        String line = bufRead.readLine();
        String[] sep1 = line.split("-");
        List<Integer> nums = new ArrayList<>();

        int result = 0;
        for(String s1 : sep1) {
            String[] sep2 = s1.split("\\+");
            int sum = 0;
            for(String s2 : sep2) {
                sum += Integer.parseInt(s2);
            }
            nums.add(sum);
        }

        result += nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            result -= nums.get(i);
        }
        System.out.println(result);
    }
}

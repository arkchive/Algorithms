package Baekjoon.Silver.S_1431;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S3_1431_시리얼_번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        int N = Integer.parseInt(bufRead.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(bufRead.readLine());
        }

        Collections.sort(list, (a, b) -> {
            if (a.length() != b.length())
                return a.length() - b.length();

            int sumA = digitSum(a);
            int sumB = digitSum(b);
            if (sumA != sumB)
                return sumA - sumB;

            return a.compareTo(b);
        });

        for (String s : list) {
            strBuild.append(s).append('\n');
        }
        System.out.println(strBuild);
    }

    static int digitSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        return sum;
    }
}

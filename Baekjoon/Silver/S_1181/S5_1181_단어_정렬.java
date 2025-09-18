package Baekjoon.Silver.S_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S5_1181_단어_정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        int N = Integer.parseInt(bufRead.readLine());

        String [] arrs = new String[N];
        for (int i = 0; i < N; i++) {
            arrs[i] = bufRead.readLine();
        }

        Arrays.sort(arrs, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        strBuild.append(arrs[0]).append("\n");
        for (int i = 1; i < N; i++) {
            if (!arrs[i].equals(arrs[i-1])) {
                strBuild.append(arrs[i]).append("\n");
            }
        }
        System.out.println(strBuild.toString());
    }
}

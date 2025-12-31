package Baekjoon.Silver.S_10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class S5_10867_중복_빼고_정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        TreeSet<Integer> set = new TreeSet<>();
        
        while (strToken.hasMoreTokens()) {
            set.add(Integer.parseInt(strToken.nextToken()));
        }

        for (int i : set) {
            strBuild.append(i).append(" ");
        }
        System.out.println(strBuild.toString());
    }
}

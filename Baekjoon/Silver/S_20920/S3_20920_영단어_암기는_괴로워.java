package Baekjoon.Silver.S_20920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class S3_20920_영단어_암기는_괴로워 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str = bufRead.readLine();
            if (str.length() >= M) {
                freq.put(str, freq.getOrDefault(str, 0) + 1);
            }
        }

        List<String> list = new ArrayList<>(freq.keySet());

        list.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a);
            }
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });

        for (String s : list) {
            strBuild.append(s).append('\n');
        }
        System.out.println(strBuild);
    }
}

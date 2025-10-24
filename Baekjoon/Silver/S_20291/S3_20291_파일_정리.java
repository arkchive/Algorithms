package Baekjoon.Silver.S_20291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class S3_20291_파일_정리 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String file = bufRead.readLine();
            String[] sep = file.split("\\.");
            map.merge(sep[1], 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            strBuild.append(e.getKey()).append(' ').append(e.getValue()).append('\n');
        }
        System.out.println(strBuild.toString());
    }
}

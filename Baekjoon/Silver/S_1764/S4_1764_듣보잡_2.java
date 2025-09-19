package Baekjoon.Silver.S_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class S4_1764_듣보잡_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        Set<String> heard = new HashSet<>(N*2);
        for (int i = 0; i < N; i++) {
            heard.add(bufRead.readLine());
        }

        Set<String> result = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            String name = bufRead.readLine();
            if(heard.contains(name)) result.add(name); // 자동 정렬
        }

        strBuild.append(result.size()).append("\n");
        for(String name : result) {
            strBuild.append(name).append("\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

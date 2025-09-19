package Baekjoon.Silver.S_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class S4_1764_듣보잡 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());
        
        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        Set<String> S = new HashSet<>(N*2);
        for (int i = 0; i < N; i++) {
            String name = bufRead.readLine();
            S.add(name);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = bufRead.readLine();
            if(S.contains(name)) list.add(name);
        }

        list.sort(Comparator.naturalOrder());

        strBuild.append(list.size()).append("\n");
        for(int i = 0; i < list.size(); i++) {
            strBuild.append(list.get(i)).append("\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

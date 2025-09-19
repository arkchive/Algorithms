package Baekjoon.Silver.S_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_1620_나는야_포켓몬_마스터_이다솜 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        int N = Integer.parseInt(strToken.nextToken());
        int M = Integer.parseInt(strToken.nextToken());

        String[] idToName = new String[N+1];
        Map<String, Integer> nameToId = new HashMap<>(N*2);

        for (int i = 1; i <= N; i++) {
            String name = bufRead.readLine();
            idToName[i] = name;
            nameToId.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String str = bufRead.readLine();
            
            if(Character.isDigit(str.charAt(0))) {
                int idx = Integer.parseInt(str);
                strBuild.append(idToName[idx]).append("\n");
            } else {
                strBuild.append(nameToId.get(str)).append("\n");
            }
        }
        System.out.println(strBuild.toString());
    }
}

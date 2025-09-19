package Baekjoon.Silver.S_7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class S5_7785_회사에_있는_사람 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;
        StringBuilder strBuild = new StringBuilder();

        int N = Integer.parseInt(bufRead.readLine());
        Set<String> in = new HashSet<>(N*2);
        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            String name = strToken.nextToken();
            String state = strToken.nextToken();
            if (state.equals("enter")) {
                in.add(name);
            } else {
                in.remove(name);
            }
        }

        List<String> list = new ArrayList<>(in);
        list.sort(Comparator.reverseOrder());

        for (String name : list) {
            strBuild.append(name).append("\n");
        }
        System.out.println(strBuild.toString());
    }
    
}

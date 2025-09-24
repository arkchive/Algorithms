package Baekjoon.Silver.S_25192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S4_25192_인사성_밝은_곰곰이 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufRead.readLine());
        int cnt = 0;
        Set<String> S = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String str = bufRead.readLine();
            if (i == 0 && str.equals("ENTER")) {
                continue;
            } else if (i > 0 && str.equals("ENTER")) {
                cnt += S.size();
                S = new HashSet<>();
            } else {
                S.add(str);
            }
        }
        cnt += S.size();
        System.out.println(cnt);
    }
    
}

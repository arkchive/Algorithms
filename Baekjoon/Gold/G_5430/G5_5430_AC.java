package Baekjoon.Gold.G_5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class G5_5430_AC {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuild = new StringBuilder();

        int T = Integer.parseInt(bufRead.readLine());
        for (int i = 0 ; i < T; i++) {
            String p = bufRead.readLine();
            char[] command = p.toCharArray();

            int n = Integer.parseInt(bufRead.readLine());
            String arr = bufRead.readLine();
            arr = arr.substring(1, arr.length()-1);
            
            Deque<Integer> dq = new ArrayDeque<>();
            if(!arr.isEmpty()) {
                String[] sep = arr.split(",");
                for(String s : sep) {
                dq.add(Integer.parseInt(s));
                }
            }

            boolean reversed = false;
            boolean error = false;
        
            for (char c : command) {
                if (c == 'R') {
                    reversed = !reversed;
                } else if (c == 'D') {
                    if (dq.isEmpty()) {
                        strBuild.append("error").append("\n");
                        error = true;
                        break;
                    }
                    if (!reversed) dq.pollFirst();
                    else dq.pollLast();
                }
            }

            if (!error) {
                strBuild.append('[');
                while (!dq.isEmpty()) {
                    strBuild.append(reversed ? dq.pollLast() : dq.pollFirst());
                    if (!dq.isEmpty()) strBuild.append(',');
                }
                strBuild.append(']').append('\n');
            }
        }
        System.out.println(strBuild.toString());
    }
}

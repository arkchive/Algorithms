package Baekjoon.Silver.S_2941;

import java.util.Scanner;
import java.util.Set;

public class S5_2941_크로아티아_알파벳 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Set<String> patterns = Set.of("c=", "c-", "d-", "lj", "nj", "s=", "z=");

        int i = 0;
        int cnt = 0;
        int N = str.length();
        while (i < N) {
            if (i + 2 < N && str.charAt(i) == 'd' && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
                cnt++;
                i += 3;
            } else if (i + 1 < N && patterns.contains(str.substring(i, i+2))) {
                cnt++;
                i += 2;
            } else {
                cnt++;
                i += 1;
            }
        }
        
        System.out.println(cnt);
        scan.close();
    }
    
}

package Baekjoon.Bronze.B_16916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_16916_부분_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        String S = bufRead.readLine();
        String P = bufRead.readLine();

        if (KMP(S, P)) System.out.println(1);
        else System.out.println(0);
    }

    /*
     * KMP 알고리즘 : 패턴 내부의 반복되는 구조를 이용해 불필요한 비교를 건너뛰는 알고리즘
     * KMP 시간 복잡도: O(N+M) 
     * 브루트포스보다 훨씬 빠름(contains도 마찬가지)
     * 브루트포스 시간 복잡도: O(NxM)
     */
    static boolean KMP(String s, String p) {
        int[] lps = buildLPS(p);
        int i = 0; 
        int j = 0;

        while (i < s.length()) {
            if (s.charAt(i) == p.charAt(j)) { // 현재 문자 일치 -> 계속 앞으로 진행
                i++;
                j++;

                if (j == p.length()) return true; 
            } else { // 현재 문자 불일치
                if (j != 0) { // 처음부터 다시 비교할 필요 없이 맞았던 부분만큼 점프해서 다시 비교
                    j = lps[j - 1];
                } else { // 처음부터 틀렸으므로 점프할 곳 없음
                    i++;
                }
            }
        }
        return false;
    }

    // 패턴 내부의 반복 구조를 계산하는 LPS 배열 생성
    // 접두사랑 접미사가 같은 최대 길이
    static int[] buildLPS(String p) {
        int[] lps = new int[p.length()];
        int len = 0; // 현재까지 일치한 접두사/접미사 길이

        for (int i = 1; i < p.length(); i++) {
            // p[i]와 p[len]이 다르면, 더 짧은 prefix로 이동해 다시 비교
            while (len > 0 && p.charAt(i) != p.charAt(len))
                len = lps[len - 1];

            // p[i]와 p[len]이 같으면, 길이 1 증가
            if (p.charAt(i) == p.charAt(len))
                lps[i] = ++len;
        }
        return lps;
    }
}

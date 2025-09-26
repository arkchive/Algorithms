package Baekjoon.Silver.S_24060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_24060_알고리즘_수업_병합_정렬_1 {

    static int N, K;
    static int[] A, tmp;
    static long cnt = 0;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(bufRead.readLine());

        N = Integer.parseInt(strToken.nextToken());
        K = Integer.parseInt(strToken.nextToken());

        strToken = new StringTokenizer(bufRead.readLine());
        A = new int[N];
        tmp = new int[N];

        for (int i = 0; i< N; i++) {
            A[i] = Integer.parseInt(strToken.nextToken());
        }

        mergeSort(0, N-1);
        System.out.println(answer);
    }

    static void merge(int p, int q, int r) {
        int i = p, j = q + 1, t = 0;
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }
        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        i = p; t = 0;
        while (i <= r) {
            A[i] = tmp[t];
            cnt++;
            if (cnt == K) answer = A[i];
            i++; t++;
        }
    }

    static void mergeSort(int p, int r) {
        if (p < r) {
            int q = p + (r - p) / 2;
            mergeSort(p, q);
            mergeSort(q+1, r);
            merge(p, q, r);
        }

    }
    
}

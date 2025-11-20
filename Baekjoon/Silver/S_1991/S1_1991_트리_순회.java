package Baekjoon.Silver.S_1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1991_트리_순회 {
    static int N;
    static int[] left, right;
    static StringBuilder strBuild = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer strToken = null;

        N = Integer.parseInt(bufRead.readLine());
        left = new int[26];
        right = new int[26];

        for (int i = 0; i < N; i++) {
            strToken = new StringTokenizer(bufRead.readLine());
            char parent = strToken.nextToken().charAt(0);
            char leftChild = strToken.nextToken().charAt(0);
            char rightChild = strToken.nextToken().charAt(0);

            int p = parent - 'A';
            left[p] = (leftChild == '.') ? -1 : leftChild - 'A';
            right[p] = (rightChild == '.') ? -1 : rightChild - 'A';
        }
        preorder(0);
        strBuild.append('\n');
        inorder(0);
        strBuild.append('\n');
        postorder(0);
        System.out.println(strBuild.toString());
    }

    static void preorder(int node) {
        if (node == -1) return;
        strBuild.append((char)(node + 'A'));
        preorder(left[node]);
        preorder(right[node]);
    }

    static void inorder(int node) {
        if (node == -1) return;
        inorder(left[node]);
        strBuild.append((char)(node + 'A'));
        inorder(right[node]);
    }

    static void postorder(int node) {
        if (node == -1) return;
        postorder(left[node]);
        postorder(right[node]);
        strBuild.append((char)(node + 'A'));
    }

}

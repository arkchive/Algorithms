package Baekjoon.Silver.S_4673;

public class S5_4673_셀프_넘버 {
    public static void main(String[] args) {
        StringBuilder strBuild = new StringBuilder();
        boolean[] isGenerated = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = d(i);
            if (n <= 10000) {
                isGenerated[n] = true;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (!isGenerated[i]) strBuild.append(i).append('\n');
        }
        System.out.println(strBuild.toString());
    }

    static int d (int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

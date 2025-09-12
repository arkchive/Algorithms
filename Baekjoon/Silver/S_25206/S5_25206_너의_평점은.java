package Baekjoon.Silver.S_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class S5_25206_너의_평점은 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        double creditSum = 0;
        Map<String, Double> ratings = Map.of(
            "A+", 4.5,
            "A0", 4.0,
            "B+", 3.5,
            "B0", 3.0,
            "C+", 2.5,
            "C0", 2.0,
            "D+", 1.5,
            "D0", 1.0,
            "F",  0.0
        );

        for (int i = 0; i < 20; i++) {
            String[] line = bufRead.readLine().split(" ");
            Double credit = Double.parseDouble(line[1]);
            String rating = line[2];

            if (rating.equals("P")) continue;
            creditSum += credit;
            total += credit * ratings.get(rating);       
        }
        System.out.println(total / creditSum);
    }
    
}

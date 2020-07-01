package step.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class arr_4344 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int n = Integer.parseInt(st.nextToken());
        double result = 0.0;
        double avg = 0.0;

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);

            int stuNum = Integer.parseInt(st.nextToken());
            int[] score = new int[stuNum];

            for (int j = 0; j < stuNum; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                avg += score[j];
            }

            avg = avg / stuNum;

            for (int j = 0; j < stuNum; j++) {
                if (score[j] > avg)
                    result++;
            }

            result = Math.round(result/ stuNum * 100000) / 1000.0;

            System.out.printf("%.3f", result);
            System.out.println("%");
            avg = 0.0;
            result = 0.0;

        }

    }
}

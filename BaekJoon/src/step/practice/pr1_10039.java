package step.practice;

import java.io.*;

public class pr1_10039 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int avg = 0;

        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            avg = avg + (score < 40 ? 40 : score);
        }
        System.out.println(avg/5);
    }
}

package step.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class pr1_2523 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n * 2; i++) {
            for (int j = 0; j < Math.abs(n*2 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

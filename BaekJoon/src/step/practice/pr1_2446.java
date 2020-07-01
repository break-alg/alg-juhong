package step.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr1_2446 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n * 2; i++) {
            for (int j = n-1; j > Math.abs(n-i); j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= Math.abs(n-i)*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

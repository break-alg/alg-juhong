package step.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr1_10996 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n * 2; i++) {

            if(i % 2 == 1) {

                for (int j = 1; j <= n; j++) {
                    if(j % 2 == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            } else {
                for (int j = 1; j <= n; j++) {
                    if(j % 2 == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

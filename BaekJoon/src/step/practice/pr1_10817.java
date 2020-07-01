package step.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class pr1_10817 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n);
        System.out.println(n[1]);
    }
}

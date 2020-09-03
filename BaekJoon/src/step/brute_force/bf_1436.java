package step.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bf_1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int n = Integer.parseInt(st.nextToken());
        int result = 666;

        while(n > 0) {

            while(!(String.valueOf(result)).contains("666")) {
                result++;
            } result++;
            n--;
        }
        result--;

        System.out.println(result);
    }
}

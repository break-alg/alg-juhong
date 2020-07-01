package step.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class arr_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int n = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        double avg = 0.0;

        s = br.readLine();
        st = new StringTokenizer(s);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            avg += (double)arr[i] / max * 100.0;
        }

        avg = avg / n;

        System.out.println(avg);

    }
}

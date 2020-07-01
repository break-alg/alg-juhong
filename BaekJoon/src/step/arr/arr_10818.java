package step.arr;

import java.awt.event.MouseAdapter;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class arr_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int n = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        s = br.readLine();
        st = new StringTokenizer(s);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(min + " " + max);

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[n-1]);

    }
}

package step.loop;

import java.io.*;
import java.util.StringTokenizer;

public class for_15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            bw.write((x + y) + "\n");

        }
        bw.flush();
        bw.close();

    }
}

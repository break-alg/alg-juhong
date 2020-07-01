package step.loop;

import java.io.*;
import java.util.StringTokenizer;

public class while_10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = "";

        while ((line = br.readLine()) != null && line.length() != 0) {

            String[] arr = line.split(" ");

            sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

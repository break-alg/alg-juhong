package step.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if_2753 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute >= 45) {
            minute -= 45;
        } else {
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            minute = minute - 45 + 60;
        }
        System.out.println(hour + " " + minute);
    }
}

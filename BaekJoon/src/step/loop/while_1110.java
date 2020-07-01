package step.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class while_1110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int num = Integer.parseInt(s);
        int newNum = num;
        int result = 0;

        do {
            result++;

            int numT = newNum / 10;
            int numO = newNum % 10;

            newNum = numO * 10 + ((numT + numO) % 10);

        } while(num !=  newNum);

        System.out.println(result);
    }
}

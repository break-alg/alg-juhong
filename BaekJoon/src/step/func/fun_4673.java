package step.func;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fun_4673 {
    public static void main(String[] args) throws IOException {

        int n = 0;

        while(n<=10000) {
            if (!isSelfNum(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean isSelfNum(int n) {

        return true;
    }
}

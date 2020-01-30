package basic100.input_output;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        sc.close();

        List num = new ArrayList();
        int len=0;
        while(input>0) {

            num.add(input%10);

            input /= 10;
            // 자릿수 계산
            len+=1;

        }
        for (int j = num.size()-1; j >= 0; j--) {
            System.out.println("[" + (int)num.get(j) * ((int)Math.pow(10, --len)) + "]");
        }

    }
}

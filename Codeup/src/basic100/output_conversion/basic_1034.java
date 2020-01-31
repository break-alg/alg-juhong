package basic100.output_conversion;

import java.util.Scanner;

public class basic_1034 {
//    8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        sc.close();

        int output = Integer.valueOf(input, 8);
        System.out.println(output);
    }
}

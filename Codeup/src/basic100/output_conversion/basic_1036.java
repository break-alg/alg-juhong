package basic100.output_conversion;

import java.util.Scanner;

public class basic_1036 {
//    영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input;
        input = sc.next().charAt(0);
        sc.close();

        int output = (int) input;
        System.out.println(output);
    }
}

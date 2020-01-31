package basic100.output_conversion;

import java.util.Scanner;

public class basic_1037 {
//    10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
//    단, 0 ~ 255 범위의 정수만 입력된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        sc.close();

        char output = (char) input;
        System.out.println(output);
    }
}

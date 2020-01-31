package basic100.output_conversion;

import java.util.Scanner;

public class basic_1032 {
    // 10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        sc.close();

        System.out.println(Integer.toHexString(input));
    }
}

package basic100.output_conversion;

import java.util.Scanner;

public class basic_1033 {
    // 10진수를 입력받아 16진수(hexadecimal) 대문로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        sc.close();

        System.out.println(Integer.toHexString(input).toUpperCase());

        // 10진수를 16진수로 출력
//        System.out.format("%02X%n", 255);  // FF
//        System.out.format("%02x%n", 255);  // ff
//        System.out.format("%X%n"  , 10);   // A
    }
}

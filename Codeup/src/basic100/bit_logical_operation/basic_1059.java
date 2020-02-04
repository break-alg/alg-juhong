package basic100.bit_logical_operation;

import java.util.Scanner;

public class basic_1059 {
//   입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();

        sc.close();

        System.out.println(~input);
    }
}

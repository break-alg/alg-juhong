package basic100.bit_shift;

import java.util.Scanner;

public class basic_1047 {
//   정수 1개를 입력받아 2배 곱해 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();

        sc.close();

        System.out.println(input<<1);
    }
}

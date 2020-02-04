package basic100.bit_logical_operation;

import java.util.Scanner;

public class basic_1060 {
//   입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA, inputB;
        inputA = sc.nextInt();
        inputB = sc.nextInt();

        sc.close();

        System.out.println(inputA & inputB);
    }
}

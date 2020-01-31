package basic100.arithmetic_operation;

import java.util.Scanner;

public class basic_1040 {
//    입력된 정수의 부호를 바꿔 출력해보자. 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        sc.close();

        System.out.println(-input);
    }
}

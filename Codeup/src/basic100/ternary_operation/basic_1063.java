package basic100.ternary_operation;

import java.util.Scanner;

public class basic_1063 {
    //   입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자. 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        System.out.println((a > b) ? a : b);
    }
}

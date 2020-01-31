package basic100.arithmetic_operation;

import java.util.Scanner;

public class basic_1045 {
//    정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
//    단 0 <= a, b <= 2147483647, b는 0이 아니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        System.out.println((long)a + b);
        System.out.println((long)a - b);
        System.out.println((long)a * b);
        System.out.println((long)a / b);
        System.out.println((long)a % b);
        System.out.format("%.2f", (float)a / b);
    }
}

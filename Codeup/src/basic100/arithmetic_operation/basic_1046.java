package basic100.arithmetic_operation;

import java.util.Scanner;

public class basic_1046 {
//     정수 3개를 입력받아 합과 평균을 출력해보자. 단, -2147483648 ~ +2147483647
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        System.out.println((long)a + b + c);
        System.out.format("%.1f", ((float)a + b + c) / 3);
    }
}

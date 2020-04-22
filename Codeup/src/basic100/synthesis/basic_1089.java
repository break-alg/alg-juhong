package basic100.synthesis;

import java.io.IOException;
import java.util.Scanner;

public class basic_1089 {
    // 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
    // n번째 수를 출력하는 프로그램을 만들어보자.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, d, n;
        int result;
        a = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();
        sc.close();

        result = a + (n-1) * d;
        System.out.println(result);
    }
}


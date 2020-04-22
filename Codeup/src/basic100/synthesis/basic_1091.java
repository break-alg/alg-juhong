package basic100.synthesis;

import java.io.IOException;
import java.util.Scanner;

public class basic_1091 {
    // 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
    // n번째 수를 출력하는 프로그램을 만들어보자.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, m, d, n;
        long result;
        a = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();
        sc.close();

        result = a;
        for(int i=1; i<n; i++) {
            result = result * m + d;
        }
        System.out.println(result);

    }
}


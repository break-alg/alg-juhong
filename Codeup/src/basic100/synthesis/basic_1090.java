package basic100.synthesis;

import java.io.IOException;
import java.util.Scanner;

public class basic_1090 {
    // 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
    // n번째 수를 출력하는 프로그램을 만들어보자.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, r, n;
        long result;
        a = sc.nextInt();
        r = sc.nextInt();
        n = sc.nextInt();
        sc.close();

        result = ((long)a * (long)Math.pow(r, n-1));
        System.out.println(result);

    }
}


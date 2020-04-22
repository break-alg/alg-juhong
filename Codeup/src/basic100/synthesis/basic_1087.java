package basic100.synthesis;

import java.io.IOException;
import java.util.Scanner;

public class basic_1087 {
    // 1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
    // 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.

    //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        int result = 0;
        input = sc.nextInt();
        sc.close();

        for(int i=1; result<input; i++)
            result += i;

        System.out.println(result);

    }
}


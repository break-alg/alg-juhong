package basic100.synthesis;

import java.util.Scanner;

public class basic_1080 {
    // 1, 2, 3 ... 을 계속 더해 나갈 때,
    // 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
    // 계속 더하는 프로그램을 작성해보자.
    // 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int i, sum = 0;

        input = sc.nextInt();
        for (i = 0; sum < input; i++) {
            sum += i;
        }
        System.out.println(--i);

    }
}


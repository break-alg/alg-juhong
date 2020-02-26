package basic100.synthesis;

import java.util.Scanner;

public class basic_1078 {
    // 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int result = 0;

        input = sc.nextInt();
        for (int i = 0; i <= input; i++) {
            if(i%2 == 0)
                result += i;
        }
        System.out.println(result);
    }
}

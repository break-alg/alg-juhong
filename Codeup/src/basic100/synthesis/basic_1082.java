package basic100.synthesis;

import java.util.Scanner;

public class basic_1082 {
    // A, B, C, D, E, F 중 하나가 입력될 때,
    // 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
    // (단, A ~ F 까지만 입력된다.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        sc.close();

        int inputConv = Integer.valueOf(input, 16);


        for(int i=1; i<=15; i++) {
            // 계산결과 16진수 형태로 변환
            String result = input;
            result = String.valueOf(Integer.toHexString(inputConv * i).toUpperCase());

            System.out.println(input + "*" + Integer.toHexString(i).toUpperCase() + "=" + result);
        }

    }
}


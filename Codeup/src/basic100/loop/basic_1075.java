package basic100.loop;

import java.util.Scanner;

public class basic_1075 {
    //   정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();

        while(input != 0) {
            System.out.println(--input);
        }
    }
}
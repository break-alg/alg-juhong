package basic100.loop;

import java.util.Scanner;

public class basic_1077 {
    //  정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, start = 0;
        input = sc.nextInt();

        do {
            System.out.println(start);
            start += 1;
        } while(start < input+1);

    }
}
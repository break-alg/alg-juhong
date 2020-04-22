package basic100.synthesis;

import java.io.IOException;
import java.util.Scanner;

public class basic_1088 {
    // 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
    // 3의 배수인 경우는 출력하지 않도록 만들어보자.
    //
    // 예를 들면,
    // 1 2 4 5 7 8 10 11 13 14 ...
    // 와 같이 출력하는 것이다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        input = sc.nextInt();
        sc.close();

        for(int i=1; i<=input; i++)
            if((i%3)!=0)
                System.out.print(i + " ");
    }
}


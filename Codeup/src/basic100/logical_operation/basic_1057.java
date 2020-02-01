package basic100.logical_operation;

import java.util.Scanner;

public class basic_1057 {
//   두 개의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, output;
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
        if(a == b) {
            output = 1;
        } else {
            output = 0;
        }

        System.out.println(output);
    }
}

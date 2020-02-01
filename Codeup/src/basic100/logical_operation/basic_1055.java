package basic100.logical_operation;

import java.util.Scanner;

public class basic_1055 {
//    두 개의 참(1) 또는 거짓(0)이 입력될 때, 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, output;
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
        if(a == 1 || b == 1) {
            output = 1;
        } else {
            output = 0;
        }

        System.out.println(output);
    }
}

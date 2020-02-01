package basic100.logical_operation;

import java.util.Scanner;

public class basic_1058 {
//   두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, output;
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
        if((a == 0) && (b == 0)) {
            output = 1;
        } else {
            output = 0;
        }

        System.out.println(output);
    }
}

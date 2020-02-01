package basic100.logical_operation;

import java.util.Scanner;

public class basic_1053 {
//   1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, output;
        a = sc.nextInt();

        sc.close();
        if(a == 0) {
            output = 1;
        } else {
            output = 0;
        }

        System.out.println(output);
    }
}

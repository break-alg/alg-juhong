package basic100.comparison_operation;

import java.util.Scanner;

public class basic_1052 {
//   a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, output;
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
        if(a != b) {
            output = 1;
        } else {
            output = 0;
        }

        System.out.println(output);
    }
}

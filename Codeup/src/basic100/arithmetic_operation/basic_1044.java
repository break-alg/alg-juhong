package basic100.arithmetic_operation;

import java.util.Scanner;

public class basic_1044 {
//    정수를 1개 입력받아 1만큼 더해 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();

        sc.close();

        System.out.println((long)input+1);
    }
}

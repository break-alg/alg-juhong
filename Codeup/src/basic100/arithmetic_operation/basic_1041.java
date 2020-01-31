package basic100.arithmetic_operation;

import java.util.Scanner;

public class basic_1041 {
//    영문자 1개를 입력받아 그 다음 문자를 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input;
        input = sc.next().charAt(0);
        sc.close();

        System.out.println((char)(input+1));
    }
}

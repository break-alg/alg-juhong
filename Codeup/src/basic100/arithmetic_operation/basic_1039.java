package basic100.arithmetic_operation;

import java.util.Scanner;

public class basic_1039 {
//    정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자. (단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputX, inputY;
        inputX = sc.nextLong();
        inputY = sc.nextLong();
        sc.close();

        System.out.println(inputX + inputY);
    }
}

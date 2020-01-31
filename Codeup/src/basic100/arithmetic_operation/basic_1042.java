package basic100.arithmetic_operation;

import java.util.Scanner;

public class basic_1042 {
//    정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자. 단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputX, inputY;
        inputX = sc.nextInt();
        inputY = sc.nextInt();
        sc.close();

        System.out.println(inputX / inputY);
    }
}

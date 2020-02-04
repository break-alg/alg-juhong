package basic100.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic_1073 {
    //   정수가 순서대로 입력된다.
    //-2147483648 ~ +2147483647, 단 개수는 알 수 없다.
    //
    //0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        while (input != 0) {
            System.out.println(input);
            input = sc.nextInt();
        }
    }
}
package basic100.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic_1072 {
    //   n개의 정수가 순서대로 입력된다.
    //-2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
    //
    //n개의 입력된 정수를 순서대로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] inputs = new int[size];

        loop_for_input(sc, inputs, 0);

        loop_for_print(inputs, 0);

    }
    //  입력을 위한 재귀함수 사용 <-- 반복문 사용할 수 없음
    public static void loop_for_input(Scanner sc, int[] i, int id) {
        if ((id) < i.length) {
            i[id] = sc.nextInt();
            loop_for_input(sc, i, ++id);
        } else return;
    }
    //  출력을 위한 재귀함수 사용 <-- 반복문 사용할 수 없음
    public static void loop_for_print(int[] i, int id) {
        if ((id) < i.length) {
            System.out.println(i[id]);
            loop_for_print(i, ++id);
        } else return;
    }
}

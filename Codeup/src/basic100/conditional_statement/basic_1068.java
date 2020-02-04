package basic100.conditional_statement;

import java.util.Scanner;

public class basic_1068 {
    //   점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
    //
    //
    // 평가 기준
    // 점수 범위 : 평가
    // 90 ~ 100 : A
    // 70 ~   89 : B
    // 40 ~   69 : C
    //  0 ~   39 : D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        score = sc.nextInt();
        sc.close();

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 70) {
            System.out.println("B");
        } else if(score >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

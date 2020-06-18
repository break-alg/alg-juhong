package basic100.synthesis_array;

import java.util.Scanner;

// [기초-1차원배열] 이상한 출석 번호 부르기1
public class basic_1093 {
    // (입력) 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
    //       두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
    // (출력) 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] student = new int[23];

        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int call = sc.nextInt();
            student[call - 1] += 1;
        }

        sc.close();

        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i] + " ");
        }

    }
}


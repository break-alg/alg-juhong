package basic100.synthesis_array;

import java.util.Scanner;

// [기초-1차원배열] 이상한 출석 번호 부르기1
public class basic_1094 {
    // (입력) 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
    //       n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
    // (출력) 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();
        sc.nextLine();

        int[] callSeq = new int[n];

        for (int i = 0; i < n; i++) {
            int call = sc.nextInt();
            callSeq[i] = call;
        }

        sc.close();

        for (int i = callSeq.length - 1; i >= 0; i--) {
            System.out.print(callSeq[i] + " ");
        }

    }
}


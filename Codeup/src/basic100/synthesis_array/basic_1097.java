package basic100.synthesis_array;

import java.util.Scanner;

// [기초-2차원배열] 바둑알 십자 뒤집기
public class basic_1097 {
    // (입력) 바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다.
    //       십자 뒤집기 횟수(n)가 입력된다.
    //       십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.

    // (출력) 십자 뒤집기 결과를 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] GO = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                GO[i][j] = sc.nextInt();
            }
        }
        int n;

        int x, y;   // 좌표

        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            for (int j = 0; j < 19; j++) {
                GO[x - 1][j] = GO[x - 1][j] ^ 1;
            }
            for (int j = 0; j < 19; j++) {
                GO[j][y - 1] = GO[j][y - 1] ^1;
            }
        }

        sc.close();

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(GO[i][j] + " ");
            }
            System.out.println();
        }
    }
}


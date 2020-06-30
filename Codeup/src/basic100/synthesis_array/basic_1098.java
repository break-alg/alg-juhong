package basic100.synthesis_array;

import java.util.Scanner;

// [기초-2차원배열] 설탕과자 뽑기
public class basic_1098 {
    // (입력) 첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
    //       두 번째 줄에 놓을 수 있는 막대의 개수(n)
    //       세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
    //       바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.

    // (출력) 모든 막대를 놓은 격자판의 상태를 출력한다.
    //       막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
    //       단, 각 숫자는 공백으로 구분하여 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, w, n;    // h: 세로, w: 가로, n: 개수
        int l, d;       // l: 길이, d: 방향
        int x, y;

        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();

        int[][] board = new int[h][w];

        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            x = x - 1;
            y = y - 1;

            for (int j = 0; j < l; j++) {
                // 가로 방향
                if(d == 0) {
                    board[x][y + j] = 1;
                }
                // 세로 방향
                else {
                    board[x + j][y] = 1;
                }
            }
        }
        // 출력
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}


package basic100.synthesis_array;

import java.util.Scanner;

// [기초-2차원배열] 성실한 개미
public class basic_1099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] road = new int[10][10];

        int targetX = 0 , targetY = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                road[i][j] = sc.nextInt();
                if(road[i][j] == 2) {
                    targetX = i;
                    targetY = j;
                }
            }
        }

        int antX = 1, antY = 1;
        road[antX][antY] = 9;

        while((antX != targetX) || (antY != targetY)) {
            if((road[antX][antY + 1] == 1 && road[antX + 1][antY] == 1) || antY == 10)
                break;

            // 오른쪽 길이 있거나 도착했으면
            if((road[antX][antY + 1] == 0) || (road[antX][antY + 1] == 2)) {
                antY = antY + 1;
                road[antX][antY] = 9;
            }
            else {
                antX = antX + 1;
                road[antX][antY] = 9;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(road[i][j] + " ");
            }
            System.out.println();
        }
    }
}


package basic100.conditional_statement;

import java.util.Scanner;

public class basic_1066 {
    //   세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input[] = new int[3];

        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();

        for(int j : input) {
            if((j%2)==0)
                System.out.println("even");
            else
                System.out.println("odd");
        }

    }
}

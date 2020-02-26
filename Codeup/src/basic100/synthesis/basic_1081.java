package basic100.synthesis;

import java.util.Scanner;

public class basic_1081 {
    // 1부터 n까지, 1부터 m까지 숫자가 적힌
    // 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for (int j=1; j <=m; j++) {
                System.out.println(i + " " + j);
            }
        }

    }
}


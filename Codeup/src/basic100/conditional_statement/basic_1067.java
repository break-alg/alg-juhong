package basic100.conditional_statement;

import java.util.Scanner;

public class basic_1067 {
    //   정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        sc.close();

        // minus, plus 구분
        if (input >= 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        // 홀,짝 구분
        if ((input % 2) == 0)
            System.out.println("even");
        else
            System.out.println("odd");

    }
}

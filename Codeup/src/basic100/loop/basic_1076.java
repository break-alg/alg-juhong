package basic100.loop;

import java.util.Scanner;

public class basic_1076 {
    //  영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input, start='a';
        input = sc.next().charAt(0);

        do {
            System.out.print(start + " ");
            start += 1;
        } while(start < input+1);

    }
}
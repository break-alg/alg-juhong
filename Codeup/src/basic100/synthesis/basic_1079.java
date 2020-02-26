package basic100.synthesis;

import java.util.Scanner;

public class basic_1079 {
    // 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputs;

        while(sc.hasNext()) {
            inputs = sc.next();
            System.out.println(inputs);
            if(inputs.equals("q")) {
                break;
            }
        }
    }
}

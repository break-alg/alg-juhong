package basic100.synthesis;

import java.io.IOException;
import java.util.Scanner;

public class basic_1086 {
    // 이미지의 가로 해상도 w, 세로 해상도 h, 한 픽셀을 저장하기 위한 비트 b 가 주어질 때,
    // 압축하지 않고 저장하기 위해 필요한 저장 용량을 계산하는 프로그램을 작성해 보자.

    // (입력) w, h, b 가 공백을 두고 입력된다.
    //       단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
    // (출력) 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
    //       소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int w, h, b;
        w = sc.nextInt();
        h = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        double result = 0.0;
        result = w / 1024.0 * h * b / 8.0 / 1024;

        System.out.format("%.2f" + " MB", result);

    }
}


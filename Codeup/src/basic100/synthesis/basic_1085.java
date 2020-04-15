package basic100.synthesis;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class basic_1085 {
    // 1초 동안 마이크로 소리강약을 체크하는 수를 h (헤르쯔, Hz 는 1초에 몇 번? 체크하는가를 의미한다.)
    // 한 번 체크한 결과를 저장하는 비트 b (2비트를 사용하면 0 또는 1 두 가지, 16비트를 사용하면 65536가지..)
    // 좌우 등 소리를 저장할 트랙 개수인 채널 c (모노는 1개, 스테레오는 2개의 트랙으로 저장함을 의미한다.)
    // 녹음할 시간 s가 주어질 때, 필요한 저장 용량을 계산하는 프로그램을 작성해보자.
    // 실제로 일반적인 CD 음질(44.1KHz, 16bit, 스테레오)로 1초 동안 저장하려면
    // 44100 * 16 * 2 * 1 bit의 저장공간이 필요하다.

    // (입력) h, b, c, s 가 공백을 두고 입력된다.
    //       h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
    // (출력) 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
    //       단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int h, b, c, s;
        h = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = sc.nextInt();

        sc.close();

        double result = 0.0;
        result = h / 1024.0 * b * c * s / 8.0 / 1024;

        System.out.format("%.1f" + " MB", result);

    }
}


package basic100.input_output;

import java.util.Scanner;

public class basic_1027 {
    public static void main(String[] args) {
//        년월일(yyyy.mm.dd)를 입력받아, 일월년(dd-mm-yyyy)로 출력
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        sc.close();

        String[] dateStr = input.split("\\.");
        int[] dateInt = new int[3];
        int i = 0;
        for (String d : dateStr) {
            dateInt[i++] = Integer.parseInt(d);
        }
        System.out.format("%02d-%02d-%04d", dateInt[2], dateInt[1], dateInt[0]);
    }
}

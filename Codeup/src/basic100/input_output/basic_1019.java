package basic100.input_output;

import java.util.Scanner;

public class basic_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        sc.close();

        String[] date = input.split("\\.");
        int[] dates = new int[3];
        int i=0;
        for (String d:date) {
            dates[i++] = Integer.parseInt(d);
        }

        System.out.printf("%04d.%02d.%02d", dates[0], dates[1], dates[2]);
    }
}

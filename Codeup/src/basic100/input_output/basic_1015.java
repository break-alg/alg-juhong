package basic100.input_output;

import java.util.Scanner;

public class basic_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float input;
        input = sc.nextFloat();
        sc.close();

        System.out.format("%.2f", input);
    }
}

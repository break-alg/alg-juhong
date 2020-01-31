package basic100.datatype;

import java.util.Scanner;

public class basic_1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input;
        input = sc.nextDouble();
        sc.close();

        System.out.format("%.11f", input);
    }
}

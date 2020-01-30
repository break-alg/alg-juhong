package basic100.input_output;

import java.util.Scanner;

public class basic_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        sc.close();

        String[] strSSN = input.split("-");
        int[] ssn = new int[2];
        int i=0;
        for (String s:strSSN) {
            ssn[i++] = Integer.parseInt(s);
        }

        System.out.format("%06d%d",ssn[0],ssn[1]);
    }
}

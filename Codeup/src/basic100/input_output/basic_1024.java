package basic100.input_output;

import java.util.Scanner;

public class basic_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        sc.close();

        char[] chars = input.toCharArray();
        for(char c : chars) {
            System.out.println("\'" + c + "\'");
        }
    }
}

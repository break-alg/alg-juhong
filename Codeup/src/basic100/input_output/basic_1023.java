package basic100.input_output;

import java.util.Scanner;

public class basic_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        sc.close();

        String[] nums = input.split("\\.");
        int[] num = new int[2];
        int i=0;
        for(String n : nums) {
            num[i] = Integer.parseInt(n);
            System.out.println(num[i++]);
        }

    }
}

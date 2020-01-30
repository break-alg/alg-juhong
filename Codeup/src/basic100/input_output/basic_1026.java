package basic100.input_output;

        import java.util.Scanner;

public class basic_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        sc.close();

        String[] time = input.split(":");
        System.out.format("%d", Integer.parseInt(time[1]));
    }
}

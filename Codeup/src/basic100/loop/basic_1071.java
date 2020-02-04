package basic100.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic_1071 {
    //   정수가 순서대로 입력된다.
    //-2147483648 ~ +2147483647, 단 개수는 알 수 없다.
    //
    //0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
    //while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        if(sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner scan = new Scanner(line);
            while(scan.hasNextInt()) {
                inputs.add(scan.nextInt());
            }
        }

        loop_for_java(sc, inputs, 0);

    }
    //  재귀함수 사용 <-- 반복문 사용할 수 없음
    public static void loop_for_java(Scanner sc, List<Integer> i, int id) {
        int index = id;
        if (i.get(index) != 0) {
            System.out.println(i.get(index));
            loop_for_java(sc, i, ++index);
        } else return;
    }

}

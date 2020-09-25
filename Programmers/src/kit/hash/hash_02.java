package kit.hash;

/*  [출처] https://programmers.co.kr/learn/courses/30/lessons/42577
*   접두어 검사 문제
* */
import java.util.Arrays;

public class hash_02 {
    public static void main(String[] args) {

//        String[] phone_book = {"119", "97674223", "1195524"}; // false
        String[] phone_book = {"123", "456", "789"}; // false

        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            String num = phone_book[i];
            for (int j = i + 1; j < phone_book.length; j++) {
                if(phone_book[j].startsWith(num)) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static boolean solution2(String[] phone_book) {
        /* 정렬 사용하지 않는 방법 */
        boolean answer = true;

        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(phone_book[i])) { return false; }
                if (phone_book[i].startsWith(phone_book[j])) { return false; }
            }
        }
        return answer;
    }

    public static boolean solution3(String[] phone_book) {
        /* 해시 사용 방법
        * [출처] https://codevang.tistory.com/290
        *
        * */
        boolean answer = true;

        for (int i = 0; i < phone_book.length - 1; i++) {
            int phoneHash = phone_book[i].hashCode();
            int len = phone_book[i].length();

            for (int j = i + 1; j < phoneHash; j++) {
                if (phone_book[j].length() >= len
                        && phoneHash == phone_book[j].substring(0, len).hashCode()) {
                    return false;
                }
                else if (phone_book[j].length() < len
                        && phone_book[i].substring(0, phone_book[j].length()).hashCode() == phone_book[j].hashCode()){
                    return false;
                }
            }

        }
        return answer;
    }

}

package kit.hash;

/* [출처] https://programmers.co.kr/learn/courses/30/lessons/42576 */

import java.util.HashMap;

public class hash_01 {
    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String part : participant) {
            // 동명 이인 처리
            if (map.get(part) == null) {
                map.put(part, 0);
            } else {
                int val = map.get(part);
                map.put(part,++val);
            }
        }

        for (String comp : completion) {
            int val = map.get(comp);
            map.put(comp, --val);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != -1)
                answer = key;
        }
        return answer;
    }

    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String part : participant) map.put(part, map.getOrDefault(part, 0)+ 1);

        for (String comp : completion) map.put(comp, map.get(comp) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) != 0)
                answer = key;
        }
        return answer;
    }

}

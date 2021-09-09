package kit.heap;

import java.util.PriorityQueue;

/* [출처] https://programmers.co.kr/learn/courses/30/lessons/42626
 *
 * */
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 우선 순위 큐 사용, 숫자가 낮은 것이 우선순위가 높음
        PriorityQueue<Integer> queue = new PriorityQueue();

        for (int sco: scoville)
            queue.add(sco);

        while(!queue.isEmpty()) {
            if (queue.peek() < K) {
                if (queue.size() < 2) return -1;

                int a = queue.poll();
                int b = queue.poll();

                queue.add(a + (b * 2));
                answer++;
            } else {
                break;
            }
        }
        if (answer > scoville.length - 1) return -1;

        return answer;
    }
}

public class heap_01 {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        // Result: 2
        System.out.println(sol.solution(scoville, K));
    }

}

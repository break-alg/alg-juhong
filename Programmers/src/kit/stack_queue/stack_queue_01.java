package kit.stack_queue;

/* [출처] https://programmers.co.kr/learn/courses/30/lessons/42576
* 주식 가격 문제
* */


import java.util.Stack;

public class stack_queue_01 {
    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};     // result: 4, 3, 1, 1, 0
//        int[] prices = {4, 3, 2, 1, 1};     // result: 1, 1, 1, 1, 0

        for (int p : solution(prices)) System.out.println(p);
        }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int time = 0;
            for (int j = i + 1; j < prices.length; j++) {
                time++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = time;
        }
        return answer;
    }

    public static int[] solution2(int[] prices) {
        /* 스택 사용 방법 */
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }
}

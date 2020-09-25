package kit.stack_queue;

/* [출처] https://programmers.co.kr/learn/courses/30/lessons/42586
 * 기능 개발 문제
 * */


import java.util.*;

public class stack_queue_02 {
    public static void main(String[] args) {

        int[] progresses = {90, 90, 90};
        int[] speeds = {10, 10, 10};
        // result: 3

//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};
//        // result: 2, 1

//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};
//        // result: 1, 3, 2

        for (int i : solution(progresses, speeds)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList();

        for (int i = 0; i < progresses.length; i++) {
            // 완성 소요 시간 구하기
            int time = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            queue.add(time);
        }
        // 각 배포별 기능 개수 저장
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (!queue.isEmpty()) {
            int count = 1;
            int f = queue.poll();
            for (; !queue.isEmpty() && f >= queue.peek(); ) {
                count++;
                queue.poll();
            }
            arrayList.add(count);
        }

        int[] answer = new int[arrayList.size()];

        int i = 0;
        for (int count : arrayList)
            answer[i++] = count;

        return answer;
    }

    public static int[] solution2(int[] progresses, int[] speeds) {
        /* 배열을 사용한 풀이 */
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }

    public int[] solution3(int[] progresses, int[] speeds) {
        /* Queue 효율적으로(while이나 for문 x) 사용 */
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}

package weekly_challenge;

import java.util.Arrays;
import java.util.Comparator;

public class weekly_06 {
    public static void main(String[] args) {
        int[] weights = {50, 82, 75, 120};
        String[] head2head = {"NLWL", "WNLL", "LWNW", "WWLN"};

//        int[] weights = {145, 92, 86};
//        String[] head2head = {"NLW", "WNL", "LWN"};

        System.out.println(Arrays.toString(solution(weights, head2head)));

        // Result: {3, 4, 1, 2}


    }

    public static int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[head2head.length];
        Boxer[] boxArr = new Boxer[head2head.length];

        // 승률 계산, 무거운 복서 계산
        for (int i = 0; i < head2head.length; i++) {
            String h2h = head2head[i];
            int cnt = 0;
            int match = 0;
            int weightCnt = 0;
            for (int j = 0; j < head2head.length; j++) {
                if(h2h.charAt(j)=='W') {
                    cnt++;
                    match++;
                    if(weights[i] < weights[j])
                        weightCnt++;
                } else if(h2h.charAt(j)=='L') {
                    match++;
                }
            }
            match = match == 0 ? 1 : match;
            boxArr[i] = new Boxer(i, weights[i], (double)cnt/match , weightCnt);
        }

        for (int i = 0; i < boxArr.length; i++) {
            System.out.println(boxArr[i].toString());
        }


        Arrays.sort(boxArr, Comparator.reverseOrder());

        for (int i = 0; i < boxArr.length; i++) {
            answer[i] = boxArr[i].idx + 1;
        }
        System.out.println("====================");
        for (int i = 0; i < boxArr.length; i++) {
            System.out.println(boxArr[i].toString());
        }

        return answer;
    }
    static class Boxer implements Comparable<Boxer> {
        int idx;
        int weight;
        double rate;
        int winCnt;

        public Boxer(int id, int weight, double rate, int winCnt) {
            this.idx = id;
            this.weight =weight;
            this.rate = rate;
            this.winCnt = winCnt;
        }

        @Override
        public int compareTo(Boxer other) {
            if (this.rate < other.rate)
                return -1;
            else if (this.rate == other.rate) {
                if (this.winCnt < other.winCnt)
                    return -1;
                else if (this.winCnt == other.winCnt) {
                    if (this.weight < other.weight)
                        return -1;
                    else if (this.weight == other.weight) {
                        if (this.idx < other.idx)
                            return 1;
                        else if (this.idx == other.idx)
                            return 0;
                        else return -1;
                    }
                    else return 1;
                }
                else return 1;
            }
            else
                return 1;
        }

        public String toString() {
            return "IDX: " + idx + " WEIGHT: " + weight + " RATE: " + rate + " winCnt: " + winCnt;
        }
    }
}

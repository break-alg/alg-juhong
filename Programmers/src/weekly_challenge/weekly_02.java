package weekly_challenge;

public class weekly_02 {
    public static void main(String[] args) {

//    int[][] scores = {{100, 90, 98, 88, 65},
//            {50, 45, 99, 85, 77},
//            {47, 88, 95, 80, 67},
//            {61, 57, 100, 80, 65},
//            {24, 90, 94, 75, 65},
//            };
        int[][] scores = {{0, 0, 0, 100},
                {0, 0, 0, 100},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};


        System.out.println(solution(scores));

    }

    public static String otherSolution(int[][] scores) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < scores.length; i++) {
            int max = 0;
            int min = 101;
            int sum = 0;
            int divide = scores.length;

            for (int j = 0; j < scores[i].length; j++) {
                int score = scores[j][i];
                if (i != j) {
                    if (score < min) min = score;
                    if (score > max) max = score;
                }
                sum += score;
            }
            if (scores[i][i] < min || scores[i][i] > max) {
                sum -= scores[i][i];
                divide--;
            }

            double score = (double) sum / divide;
            sb.append(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 50 ? "D" : "F") ;
        }
        return sb.toString();
    }

    public static String solution(int[][] scores) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < scores.length; i++) {
            double score = getAvgScore(scores, i);
            sb.append(getGrade(score));
        }
        answer = sb.toString();
        return answer;
    }

    public static double getAvgScore(int[][] scores, int id) {
        double avg = 0;
        int min = 101, max = -1;
        int selfMin = 0, selfMax = 0;
        boolean unique = false;

        for (int i = 0; i < scores[id].length; i++) {
            if (min >= scores[i][id]) {
                if (i == id && scores[id][id] != min) unique = true;
                min = scores[i][id];
                selfMin = i;
            }
            if (max <= scores[i][id]) {
                if (scores[id][id] != max && id == i) unique = true;
                max = scores[i][id];
                selfMax = i;
            }
            avg += scores[i][id];
        }

        if (unique && (selfMin == id || selfMax == id)) {
            avg -= scores[id][id];
            avg /= scores.length - 1;
        } else {
            avg /= scores.length;
        }

        return avg;
    }

    public static String getGrade(double score) {
        String grade;
        if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else if (score >= 50) grade = "D";
        else grade = "F";

        return grade;
    }
}

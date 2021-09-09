package weekly_challenge;

public class weekly_04 {
    public static void main(String[] args) {

        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7, 5, 5};
        System.out.println(solution(table, languages, preference));
        // Return: "HARDWARE"


    }

    public static String solution(String[] table, String[] languages, int[] preference) {
        int max = 0;
        int id = 0;

        for (int i = 0; i < table.length; i++) {
            String[] scoreTable = table[i].split(" ");
            int score = 0;

            for (int j = 1; j < scoreTable.length; j++) {

                // score 계산
                for (int k = 0; k < languages.length; k++) {
                    if (scoreTable[j].equals(languages[k])) {
                        score += (scoreTable.length-j) * preference[k];
                    }
                }
                if (max < score) {
                    max = score;
                    id = i;
                } else if (max == score) {
                    id = (table[id].split(" ")[0].compareTo(scoreTable[0]) > 0) ? i : id;
                }
            }
        }
        return table[id].split(" ")[0];
    }
}

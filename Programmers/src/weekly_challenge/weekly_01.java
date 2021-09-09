package weekly_challenge;

public class weekly_01 {
    public static void main(String[] args) {

        int price = 3;
        int money = 20;
        int count = 4;

        // Result: 10

        System.out.println(solution(price, money, count));

    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        long fee = 0;
        // 필요한 금액 계산
        for (int i = 1; i <= count; i++) {
            fee += (i * price);
        }
        answer = fee - money;
        if (answer < 0)
            return 0;

        return answer;
    }
}

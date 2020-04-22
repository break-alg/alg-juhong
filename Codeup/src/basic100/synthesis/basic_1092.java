package basic100.synthesis;

import java.io.IOException;
import java.util.Scanner;

public class basic_1092 {
    // 같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
    // 매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
    //
    // 예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
    // 한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA, inputB, inputC;
        int result = 1;
        inputA = sc.nextInt();
        inputB = sc.nextInt();
        inputC = sc.nextInt();
        sc.close();

//        // while 문 사용
//        while((result % inputA != 0) || (result % inputB != 0) || (result % inputC != 0))
//            result++;
//        System.out.println(result);

        // method 사용
        System.out.println(lcm(lcm(inputA, inputB), inputC));

    }

    // 최소 공배수
    public static int lcm(int a, int b) {
        int gcdValue = gcd(a, b);

        if(gcdValue == 0) return 0;

        return Math.abs((a * b) / gcdValue);
    }

    // 최대공약수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}


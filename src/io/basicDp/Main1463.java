package io.basicDp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1]; // 각 숫자에 도달하는 최소 연산 횟수를 저장하기 위한 배열
        dp[1] = 0; // 1은 이미 1이므로 연산 횟수가 0입니다.

        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1; // 현재 숫자에서 1을 뺀 경우의 연산 횟수
            if (i % 2 == 0) // 현재 숫자가 2로 나누어 떨어지는 경우
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나눈 경우와 비교하여 최소값 선택
            if (i % 3 == 0) // 현재 숫자가 3으로 나누어 떨어지는 경우
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나눈 경우와 비교하여 최소값 선택
        }

        System.out.println(dp[num]); // 결과 출력
    }
}
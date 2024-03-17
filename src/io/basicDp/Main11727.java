package io.basicDp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num + 2];

        dp[1] = 1;
        dp[2] = 3;
        //3번째 까지 생각해보고 *2라는 결과를 얻은뒤 실행 해볼필요가 있음
        for (int i = 3; i <= num; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
        }
        System.out.print(dp[num]);
    }
}

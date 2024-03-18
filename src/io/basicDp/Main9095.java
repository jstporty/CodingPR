package io.basicDp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] count = new int[11];

        count[1] = 1;
        count[2] = 2;
        count[3] = 4;
        for (int j = 4; j < 11; j++) {
            count[j] = (count[j - 1] + count[j - 2] + count[j - 3]) % 10007;
        }

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(count[n]);
        }


    }
}
/**
 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
 *
 * 입력값
 * 3
 * 4
 * 7
 * 10
 *
 * 출력값
 * 7
 * 44
 * 274
 * */

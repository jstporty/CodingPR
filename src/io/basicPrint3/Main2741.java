package io.basicPrint3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        int num=Integer.parseInt(br.readLine());
        while (count <= num) {
            System.out.println(count);
            count++;
        }
    }
}
/**
 *  첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 *
 *  입력             출력
 *  5                  1
 *                      2
 *                      3
 *                      4
 * */

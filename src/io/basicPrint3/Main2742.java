package io.basicPrint3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num=Integer.parseInt(br.readLine());

        for (int i = num; i>=1; i--){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
/**
 *  첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 *
 *  입력             출력
 *  5                  5
 *                      4
 *                      3
 *                      2
 * */
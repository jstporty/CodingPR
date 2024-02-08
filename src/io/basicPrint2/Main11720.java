package io.basicPrint2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        String arr[] = new String[num];
        arr = br.readLine().split("");
        for (int i = 0; i < num; i++) {
            result += Integer.parseInt(arr[i]);
        }
        System.out.print(result);
    }
}
/**
 *입력으로 주어진 숫자 N개의 합을 출력한다.
 *
 * 입력         출력
 * 5
 * 54321      15
 *
 *
 * */
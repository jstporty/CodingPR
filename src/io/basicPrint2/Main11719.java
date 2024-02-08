package io.basicPrint2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String aa = "";
        while ((aa = br.readLine()) != null) {
            System.out.print(aa);
        }
    }
}

/**
 * 문자열 그대로 출력하기 2 공백이 있음
 * */

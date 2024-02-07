package io.stringPrint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s = br.readLine())!=null) {
            System.out.println(s);
        }
        br.close();
    }
}
/**
 * 문자열 그대로 입력하기
 *
 * */

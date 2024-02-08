package io.basicPrint2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11718 {
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
 * 문자열 그대로 출력하기1
 *
 * */

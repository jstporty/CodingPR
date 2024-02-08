package io.basicPrint1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i < num + 1; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + a +" + "+ b + " = " + (a + b));
        }
    }
}

/**
 * 입력값                  출력값
 * 5
 * 1 1                 Case #1: 1 + 1 = 2
 * 2 3                 Case #2: 2 + 3 = 5
 * 3 4                 Case #3: 3 + 4 = 7
 * 9 8                 Case #4: 9 + 8 = 17
 * 5 2                 Case #5: 5 + 2 = 7
 * */
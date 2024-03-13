package io.basicPrint4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        for (int i = num; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < count; k++) {
                System.out.print("*");
            }
            System.out.println();
            count += 2;
        }
    }
}

/**
 * 입력값
 * 5
 * <p>
 * 출력값
 * //      *
 * //     ***
 * //    *****
 * //   *******
 * //  *********
 */

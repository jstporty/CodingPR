package io.basicPrint4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (num - i) * 2; k++) {
                System.out.print(" ");
            }
            for (int h = 1; h <= i; h++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num-1; i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= (num-i)*2; k++) {
                System.out.print(" ");
            }
            for (int h = i ; h >=1; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
 * 입력값
 * 5
 * <p>
 * 출력값
 * <p>
 * //  *            *
 * //  **         **
 * //  ***      ***
 * //  ****   ****
 * //  **********
 * //  ****   ****
 * //  ***      ***
 * //  **         **
 * //  *            *
 */

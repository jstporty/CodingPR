package io.baseicPage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 2;
        int count = 1;

        while (n >= sum) {
            sum += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}

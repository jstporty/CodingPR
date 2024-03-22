package io.baseicPage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(input);
        StringBuilder aa = new StringBuilder();
        for (int i = 0; i < n; i++) {
            aa.append(input[i]).append("\n");
        }

        System.out.println(aa);
    }

}

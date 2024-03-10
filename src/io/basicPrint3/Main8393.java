package io.basicPrint3;

import java.util.*;
import java.io.*;

public class Main8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        br.close();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += i;
        }
        System.out.print(count);
    }
}
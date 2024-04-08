package io.baseicPage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        int[] n = new int[num];
         st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n);
        System.out.print(n[index-1]);
    }
}

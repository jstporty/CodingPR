package io.integerPrint;

import java.io.*;
import java.util.StringTokenizer;

public class Main11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i+1) + ": " + (first + second));

            bw.flush();
            bw.newLine();
        }
        br.close();
        bw.flush();
    }
}

/**
 * 입력값                  출력값
 * 5
 * 1 1                 Case #1: 2
 * 2 3                 Case #2: 5
 * 3 4                 Case #3: 7
 * 9 8                 Case #4: 17
 * 5 2                 Case #5: 7
 * */

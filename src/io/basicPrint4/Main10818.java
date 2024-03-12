package io.basicPrint4;

import java.io.*;
import java.util.StringTokenizer;

public class Main10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int calc;
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < num; i++) {
            calc = Integer.parseInt(st.nextToken());
            if (calc > max) {
                max = calc;
            }
            if (calc < min) {
                min = calc;
            }
        }

        bw.write(min + " " + max);
        br.close();
        bw.flush();
        bw.close();
    }
}
/**
 * 최소값 최댓값 구하기
 * 입력값
 * 5
 * 20 10 35 30 7
 *
 * 츌력값
 * 7 35
 */
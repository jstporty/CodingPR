package io.basicPrint3;

import java.io.*;

public class Main2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for (int i = num; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                bw.write(" ");
            }
            for (int k = num - i + 1; k > 0; k--) {
                bw.write("*");
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

package io.integerPrint;

import java.io.*;
import java.util.StringTokenizer;

public class Main10951 {
    public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String s = "";
            while (!(s = br.readLine()).isEmpty()) {
                StringTokenizer st = new StringTokenizer(s);

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                bw.write(A + B + "\n");

            }
            br.close();
            bw.close();
            bw.flush();

    }
}
/**
 * 입력값      출력값
 *
 *  1 1           2
 *  2 3           5
 *  3 4           7
 *  9 8           17
 *  5 2           7
 *
 * */
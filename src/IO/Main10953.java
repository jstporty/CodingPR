package IO;

import java.io.*;
import java.util.StringTokenizer;

public class Main10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A + B + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}

/**
 * 입력값      출력값
 *   5
 *   1,1         2
 *   2,3         5
 *   3,4         7
 *   9,8         17
 *   5,2         7

 * */

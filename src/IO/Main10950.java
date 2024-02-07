package IO;

import java.io.*;
import java.util.StringTokenizer;

public class Main10950 {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int num = Integer.parseInt(br.readLine());

            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());

                int sum = first + second;

                bw.write(String.valueOf(sum));
                bw.newLine();
            }
        }
    }
}
/**
 * 입력값      출력값
 * 5
 * 1 1           2
 * 2 3           5
 * 3 4           7
 * 9 8           17
 * 5 2           7
 *
 * */

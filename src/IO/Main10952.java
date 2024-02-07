package IO;

import java.io.*;
import java.util.StringTokenizer;

public class Main10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A==0&&B==0){
                break;
            }
            bw.write(A+B+"\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
/**
 * 입력값      출력값
 *   1 1          2
 *   2 3          5
 *   3 4          7
 *   9 8          17
 *   5 2          7
 *   0 0
 * 마지막에  0 0이 오면 종료
 * */
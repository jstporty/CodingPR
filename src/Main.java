import java.io.*;
import java.util.StringTokenizer;

public class Main {
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
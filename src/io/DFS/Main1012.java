package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1012 {
    static int m, n; // m = 가로  n = 세로
    static int[][] arr;
    static boolean visited[][];
    static int[] x = {1, -1, 0, 0};
    static int[] y = {0, 0, 1, -1};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= num; i++) {
            StringTokenizer secontLine = new StringTokenizer(br.readLine());
            n = Integer.parseInt(secontLine.nextToken());
            m = Integer.parseInt(secontLine.nextToken());
            int bachoo = Integer.parseInt(secontLine.nextToken());
            arr = new int[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < bachoo; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (!visited[j][k] && arr[j][k] == 1) {
                        dfs(j, k);
                        count++;

                    }
                }
            }
            sb.append(count).append("\n");
            count = 0;
        }
        System.out.println(sb);

    }

    public static void dfs(int aa, int bb) {
        visited[aa][bb] = true;

        for (int i = 0; i < 4; i++) {
            int dx = aa + x[i];
            int dy = bb + y[i];

            if (dx >= 0 && dx < n && dy >= 0 && dy < m && arr[dx][dy] == 1 && !visited[dx][dy]) {
                dfs(dx, dy);
            }
        }

    }
}

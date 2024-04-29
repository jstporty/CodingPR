package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10451 {
    static int n, num;
    static int arr[][];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            arr = new int[num + 1][num + 1];
            visited = new boolean[num + 1];

            int count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= num; j++) {
                int a = j;
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;

            }

            for (int j = 1; j <= num; j++) {
                if (!visited[j]) {
                    dfs(j);
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }

    public static void dfs(int param) {
        visited[param] = true;

        for (int i = 1; i <= num; i++) {
            if (arr[param][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }

    }
}
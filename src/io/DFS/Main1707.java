package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1707 {

    static int arr[][];
    static int node, line;
    static boolean visted[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            node = Integer.parseInt(st.nextToken());
            line = Integer.parseInt(st.nextToken());
            arr = new int[node + 1][node + 1];
            visted = new boolean[node + 1];

            for (int j = 1; j < line + 1; j++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());
                arr[a][b] = arr[b][a] = 1;
            }
            int count = 0;
            for (int k = 1; k <= node; k++) {
                if (!visted[k]) {
                    dfs(k);
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("NO ");
            } else System.out.println("YES");
            count = 0;
        }


    }

    public static void dfs(int param) {
        visted[param] = true;
        for (int i = 1; i <= node; i++) {
            if (arr[param][i] == 1 && !visted[i]) {
                dfs(i);
            }
        }
    }
}

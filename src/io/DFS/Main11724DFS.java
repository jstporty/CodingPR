package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11724DFS {

    static int node, n;
    static boolean[] visted;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[node + 1][node + 1];
        visted = new boolean[node + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer aa = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(aa.nextToken());
            int b = Integer.parseInt(aa.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        int count = 0;
        for (int i = 1; i <= node; i++) {
            if (!visted[i]) {
                dfs(i);
                count++;
            }

        }
        System.out.print(count);
    }

    public static void dfs(int pram) {
        visted[pram] = true;
        for (int i = 0; i < node; i++) {
            if (arr[pram][i] == 1 && !visted[i]) {
                dfs(i);
            }
        }
    }


}

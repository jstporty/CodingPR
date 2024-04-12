package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11724 {
    static int node, line;
    static int arr[][];
    static boolean visted[];
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        arr = new int[node + 1][node + 1];
        visted = new boolean[node + 1];
        for (int i = 0; i < line; i++) {
            StringTokenizer value = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(value.nextToken());
            int b = Integer.parseInt(value.nextToken());
            arr[a][b] = arr[b][a] = 1;
            if (!visted[i]) {
                dfs(a);
            }
        }
        System.out.print(count);
    }

    static void dfs(int start) {
        for (int i = 0; i <= node; i++) {
            visted[start] = true;

            if (arr[start][i] == 1 && !visted[i]) {
                dfs(i);
                count++;
            }
        }
    }

}

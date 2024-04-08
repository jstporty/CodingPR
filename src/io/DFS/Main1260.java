package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1260 {
    static int node, line, start;
    static boolean[] visted;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        visted = new boolean[node + 1];
        arr = new int[node + 1][node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        sb.append("\n");
        visted = new boolean[node+1];

        bfs(start);
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visted[start] = true;

        sb.append(start + " ");
        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !visted[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        q.add(start);
        visted[start] = true;

        while (!q.isEmpty()) {

            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !visted[i]) {
                    q.add(i);
                    visted[i] = true;
                }
            }
        }

    }
}
/**
 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000),
 * 간선의 개수 M(1 ≤ M ≤ 10,000),
 * 탐색을 시작할 정점의 번호 V가 주어진다.
 * 5 1
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 */
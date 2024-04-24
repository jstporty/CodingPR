package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11724BFS {

    static int node, n;
    static boolean[] visited;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[node + 1][node + 1];
        visited = new boolean[node + 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer bb = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(bb.nextToken());
            int b = Integer.parseInt(bb.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for(int i=1; i<=node; i++){
            if (!visited[i]) {
                bfs(i);
                count++;
            }
        }

        System.out.print(count);
    }

    public static void bfs(int param) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(param);
        while (!queue.isEmpty()) {
            int data = queue.poll();
            visited[data] = true;

            for (int i = 1; i <= node; i++) {
                if (arr[data][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }

        }
    }
}
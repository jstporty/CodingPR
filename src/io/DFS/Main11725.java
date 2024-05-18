package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main11725 {
    static int node;
    static ArrayList<Integer> arr[];
    static int result[];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        visited = new boolean[node + 1];
        arr = new ArrayList[node + 1];

        for (int i = 1; i <= node; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 1; i < node; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        result= new int[node+1];
        dfs(1);


        for (int j = 2; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }

    public static void dfs(int currentNode) {
        visited[currentNode] = true;
        for (Integer node : arr[currentNode]) {
            if (!visited[node]) {
                result[node] = currentNode;
                dfs(node);
            }
        }

    }
}
/*
*
7
1 6
6 3
3 5
4 1
2 4
4 7
* */
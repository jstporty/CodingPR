package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main2667 {


    static int num;
    static boolean[][] visited;
    static int arr[][];
    static int[] x = {1, -1, 0, 0};
    static int[] y = {0, 0, 1, -1};
    static StringBuffer sb = new StringBuffer();
    static ArrayList houseCounts =new ArrayList<>();
    static int houseCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        arr = new int[num][num];
        visited = new boolean[num][num];

        for (int i = 0; i < num; i++) {
            String st = br.readLine();
            for (int j = 0; j < num; j++) {
                arr[i][j] = st.charAt(j) - '0';

            }
        }
        int totalCount = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                     houseCount = 0;
                    dfs(i, j);
                    houseCounts.add(houseCount);
                    }
                }
            }
        Collections.sort(houseCounts);
        System.out.println(houseCounts.size());
        for (Object count : houseCounts) {
            System.out.println(count);
        }
    }

    static void dfs(int i, int j) {
        visited[i][j] = true;
        houseCount++;
        for (int k = 0; k < 4; k++) {
            int dx = i + x[k];
            int dy = j + y[k];

            if (dx >= 0 && dx < num && dy >= 0 && dy < num && !visited[dx][dy] && arr[dx][dy] == 1) {
                dfs(dx, dy);
            }
        }
    }
}

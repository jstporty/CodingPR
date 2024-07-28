package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main1743 {
    static int m, n, num;
    static boolean[][] visited;
    static int[][] arr;
    static int[] x = {1, -1, 0, 0};
    static int[] y = {0, 0, 1, -1};
    static int count = 1;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken()); //세로
        m = Integer.parseInt(st1.nextToken()); //가로
        num = Integer.parseInt(st1.nextToken()); //음식물 갯수
        arr = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    list.add(count);
                    count = 1;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = Math.max(result, list.get(i));
        }
        System.out.println(result);
    }


    public static void dfs(int width, int height) {
        visited[width][height] = true;
        for (int i = 0; i < 4; i++) {
            int dx = width + x[i];
            int dy = height + y[i];

            if (dx >= 0 && dx <= n && dy >= 0 && dy <= m && !visited[dx][dy] && arr[dx][dy] == 1) {
                dfs(dx, dy);
                count++;
            }
        }
    }
}

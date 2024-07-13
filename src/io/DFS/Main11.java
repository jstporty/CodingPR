package io.DFS;

import java.util.*;
import java.io.*;


public class Main11 {
    static int[][] arr;
    static boolean[][] visited;
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int num =Integer.parseInt(br.readLine());
         arr = new int[num][num];
      for( int i=0; i<num; i++ ) {
          for(int j=0; j<num; j++ ) {
              arr[i][j] = Integer.parseInt(br.readLine());
              arr[j][i] = 1;
          }
      }
      int block =0;
      int[] result = new int[100];
      int count =0;

      for(int i=0; i<num; i++ ) {
          dfs(0,0, count);
          block++;
          result[block]= count;
          count=0;
      }

  }
    public static void dfs(int i, int a, int count) {

    }

}

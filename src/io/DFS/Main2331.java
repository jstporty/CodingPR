package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2331 {
    static int first;
    static int second;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        List<Integer> result = new ArrayList<>();
        Integer[] visted = new Integer[1000];
        while (true) {
            String[] parts = a.split("");
            first = (int) Math.pow(Integer.parseInt(parts[0]), b);
            second = (int) Math.pow(Integer.parseInt(parts[1]), b);
            a = String.valueOf(first + second);
            result.add(first + second);

            if (String.valueOf(first + second).equals(fixed)) {
                break;
            }


        }

        System.out.println(result.size());
    }
}

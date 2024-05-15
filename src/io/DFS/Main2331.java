package io.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2331 {
    static int first;
    static int second;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        List<Integer> numList = new ArrayList<>();
        boolean flag = true;
        int compareNum = 0;
        numList.add(Integer.valueOf(a));
        while (flag) {
            int c = 0;
            String[] parts = a.split("");

            for (String part : parts) {
                c += (int)Math.pow(Integer.parseInt(part),b);
            }

//            first = (int) Math.pow(Integer.parseInt(parts[0]), b);
//            second = (int) Math.pow(Integer.parseInt(parts[1]), b);
            a = String.valueOf(c);


            for (Integer num : numList) {
                if (c == num) {
                    flag = false;
                    compareNum = num;
                    break;
                }
            }
            if (flag) {
                numList.add(c);
            }
        }
        System.out.println(numList.indexOf(compareNum) );
    }
}

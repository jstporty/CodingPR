package io.baseicPage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();

        // 숫자 카드의 등장 횟수 세기
        for (int i = 0; i < n; i++) {
            long m = Long.parseLong(br.readLine());
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        int max = -1;
        long num = 0;

        // 가장 많이 등장한 숫자 찾기
        for (Long l : map.keySet()) {
            if (map.get(l) > max) {
                max = map.get(l);
                num = l;
            }
            if (map.get(l) == max) {
                num = Math.min(l, num);
            }
        }

        // 결과 출력
        System.out.println(num);
    }
}

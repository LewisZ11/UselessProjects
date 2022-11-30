package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class BestCombo {

    public static List<Long> helper(int[] popularity, int k) {
        long bestRes = 0;
        List<Long> result = new ArrayList<>();
        PriorityQueue<long[]> pq = new PriorityQueue<long[]>((a, b) -> (int) (a[0] - b[0]));

        for (int i = 0; i < popularity.length; i++) {
            if (popularity[i] > 0) bestRes += popularity[i];
            if (popularity[i] < 0) {
                popularity[i] = -popularity[i];
            }
        }

        Arrays.sort(popularity);
        result.add(bestRes);
        pq.add(new long[] {popularity[0], 0});

        while (!pq.isEmpty() && result.size() < k) {
            long[] cur = pq.poll();
            long u = cur[0], i = cur[1];
            result.add(bestRes - u);
            if (i + 1 < popularity.length) {
                pq.add(new long[] {u + popularity[(int) (i+1)], i+1});
                pq.add(new long[] {u - popularity[(int)i] + popularity[(int)(i+1)], i+1});
            }
        }

        return result;


    }

    public static void main(String[] args) {

        int[] arr = new int[] {2,3,10};
        System.out.println(helper(arr, 4));
    }
}

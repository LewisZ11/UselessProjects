package com.lewis.lzw06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphDemo {

    public static void main(String[] args) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        // map.put(1, new ArrayList<>());
        map.put(2, new ArrayList<>());
        map.get(2).add(1);
        map.get(2).add(3);
        map.get(2).add(4);

        // System.out.println();
        System.out.println(map.get(1));;

        map2.put(0,0);
        // map2.get(0) += 1;

        System.out.println(map.get(2));


    }
}

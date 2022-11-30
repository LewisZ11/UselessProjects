package com.company;

import java.util.*;

public class MoveLocations {


    public static List<Integer> move(int[] locations, int[] movedFrom, int[] movedTo) {


        Set<Integer> set = new HashSet<>();

        for (int location : locations) {
            set.add(location);
        }

        for (int i = 0; i < movedFrom.length; i++) {
            if (set.contains(movedFrom[i])) {
                set.remove(movedFrom[i]);
                set.add(movedTo[i]);

            }
        }

        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);

        return result;

    }

    public static void main(String[] args) {

        int[] locations = new int[] {1,7,6,8};
        int[] movedFrom = new int[] {1,7,2};
        int[] movedTo = new int[] {2,9,5};

        List<Integer> list = move(locations, movedFrom, movedTo);

        System.out.println(list);
    }
}

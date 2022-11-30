package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMaximumMiddleBox {

    public static int helper(int[] capacities) {
        int result = -1;
        Set<Integer> seen = new HashSet<>();
        Set<Integer> hasFactor = new HashSet<>();

        Arrays.sort(capacities);
        seen.add(capacities[0]);

        for (int i = 1; i < capacities.length; i++) {
            int curNum = capacities[i];

            for (int j = 1; j <= Math.sqrt(curNum); j++) {
                if (curNum % j == 0) {
                    if (seen.contains(j) || seen.contains(curNum / j)) {

                        if (i >= 2 && hasFactor.contains(j)) {
                            result = Math.max(result, j);
                        }
                        if (i >= 2 && hasFactor.contains(curNum / j)) {
                            result = Math.max(result, curNum / j);
                        }

                        hasFactor.add(curNum);
                    }
                }
            }
            seen.add(curNum);
        }
        return result;
    }




    public static void main(String[] args) {
        int[] capacities = new int[] {1,2, 6, 4, 107, 109, 1024};
        System.out.println(helper(capacities));

        int[] capacities1 = new int[] {2,4,33,96,98};
        System.out.println(helper(capacities1));

    }
}

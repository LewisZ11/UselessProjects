package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KDistinctSum {

   // public static int maxPrice(int[] prices, int k) {
//        if (prices == null || prices.length == 0) {
//            return 0;
//        }
//        Set<Integer> window = new HashSet<>();
//        Map<Integer, Integer> numToIdx = new HashMap<>();
//        int maxPrice = 0;
//        int left = 0, right = 0;
//        int currSum = 0;
//        while (right < prices.length) {
//            while (right < prices.length && window.size() < k) {
//                if (window.contains(prices[right])) {                         // move to next non-duplicate position
//                    int nextLeft = numToIdx.get(prices[right]) + 1;
//                    while (left < nextLeft) {
//                        window.remove(prices[left]);
//                        numToIdx.remove(prices[left]);
//                        currSum -= prices[left];
//                        left++;
//                    }
//                } else {
//                    window.add(prices[right]);
//                    currSum += prices[right];
//                    numToIdx.put(prices[right], right);
//                    right++;
//                }
//            }
//            maxPrice = Math.max(maxPrice, currSum);
//            window.remove(prices[left]);
//            currSum -= prices[left];
//            left++;
//        }
//        return maxPrice;
//    }


    public static int maxPrice(int[] prices, int k) {

        Set<Integer> windows = new HashSet<>();
        Map<Integer, Integer> priceToIdx = new HashMap<>();

        int left = 0, right = 0, currSum = 0, maxValue = 0;


        while (right < prices.length) {

            while (right < prices.length && windows.size() < k) {

                if (windows.contains(prices[right])) {
                    int nextLeftPos = priceToIdx.get(prices[right]) + 1;

                    while (left < nextLeftPos) {

                        windows.remove(prices[left]);
                        currSum -= prices[left];
                        left++;

                    }

                } else {

                    windows.add(prices[right]);
                    currSum += prices[right];
                    priceToIdx.put(prices[right], right);
                    right++;

                }
            }

            maxValue = Math.max(maxValue, currSum);

            windows.remove(prices[left]);
            currSum -= prices[left];
            left++;

        }

        return maxValue;


    }

    public static void main(String[] args) {

        int[] prices = new int[] {1,2,3,2,4};

        System.out.println(maxPrice(prices, 3));
    }
}

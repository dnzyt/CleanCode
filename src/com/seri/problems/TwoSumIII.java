package com.seri.problems;


/*
* Design and implement a TwoSum class. It should support the following operation: add and find.
* add(input) - Add the number input to an internal data structure.
* find(value) - Find if there exists any pair of numbers which sum is equal to the value.
* */

import java.util.HashMap;
import java.util.Map;

public class TwoSumIII {
    private Map<Integer, Integer> map = new HashMap<>();

    public void add(int input) {
        int count = map.containsKey(input) ? map.get(input) : 0;
        map.put(input, count + 1);
    }

    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int num = entry.getKey();
            int temp = value - num;
            if (temp == num) {
                if (entry.getValue() >= 2) return true;
            } else if (map.containsKey(temp)) return true;
        }
        return false;
    }


}

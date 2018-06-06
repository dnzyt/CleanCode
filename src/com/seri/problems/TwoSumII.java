package com.seri.problems;

/*
* Similar to Two Sum, except that the input array is already sorted in ascending order.
* */

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            int t = target - numbers[i];
            int secondIndex = binarySearch(numbers, t, i + 1);
            if (-1 != secondIndex) {
                return new int[] {i, secondIndex};
            }
        }
        throw new IllegalArgumentException("No Two Sum solution");


    }



    private int binarySearch(int[] array, int target, int start) {
        int left = start;
        int right = array.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (left == right && array[left] == target) ? left : -1;

    }
}

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

    /*
    * Another solution - O(n), O(1)
    * */

    public int[] twoSumAlt(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[] { left, right };
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("No Two Sum solution");
    }
}

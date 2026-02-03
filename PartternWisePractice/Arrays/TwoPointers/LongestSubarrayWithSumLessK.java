package PartternWisePractice.Arrays.TwoPointers;

import java.util.Arrays;

public class LongestSubarrayWithSumLessK {

    // Brute Force -
    public static int[] bruteForceLSWSLK(int[] arr, int k) {
        int left = 0, sum = 0;
        int maxLen = 0, startIndex = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (right - left + 1 >= maxLen) { // tie-breaker
                maxLen = right - left + 1;
                startIndex = left;
            }
        }

        return Arrays.copyOfRange(arr, startIndex, startIndex + maxLen);
    }

    public static void main(String[] args) {
        int[] nums1 = {2,5,1,7,10};
        int k = 14;
        System.out.println(Arrays.toString(bruteForceLSWSLK(nums1, k)));

    }
}

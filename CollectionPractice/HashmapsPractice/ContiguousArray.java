package CollectionPractice.HashmapsPractice;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 1) ? 1 : -1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1};
        int[] nums2 = {0, 1, 0};
        int[] nums3 = {0,1,1,1,1,1,0,0,0};

        System.out.println(findMaxLength(nums1));
        System.out.println(findMaxLength(nums2));
        System.out.println(findMaxLength(nums3));
    }
}
package CollectionPractice.HashmapsPractice;
import java.util.*;

public class LongestCommonSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int maxCount = 1;
        int count = 1;

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,4};
        System.out.println("Max Count : " + longestConsecutive(nums));
    }
}

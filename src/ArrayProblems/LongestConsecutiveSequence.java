package ArrayProblems;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int lastSmallest = Integer.MIN_VALUE;
        int seqLength = 0;
        int maxLength = Integer.MIN_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastSmallest) {
                seqLength++;
                lastSmallest = nums[i];
            } else if (nums[i] == lastSmallest) {
                continue;
            } else {
                seqLength = 1;
                lastSmallest = nums[i];
            }
            maxLength = Math.max(maxLength, seqLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(solution.longestConsecutive(nums1));

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(solution.longestConsecutive(nums2));

        int[] nums3 = {};
        System.out.println(solution.longestConsecutive(nums3));

        int[] nums4 = {1, 2, 0, 1};
        System.out.println(solution.longestConsecutive(nums4));
    }
}

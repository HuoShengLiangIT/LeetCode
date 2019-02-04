package _485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int max = 0;
        int cur = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                cur = 0;
            } else {
                cur++;
            }
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }
}

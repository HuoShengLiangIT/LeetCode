package _16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        Arrays.sort(nums);
        int len = nums.length;
        int s, e;
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < len; i++) {
            s = i + 1;
            e = len - 1;
            while (s < e) {
                int cur = nums[s] + nums[i] + nums[e];
                if (Math.abs(target - cur) <= Math.abs(target - result)) {
                    result = cur;
                }
                if (cur > target) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        return result;
    }
}

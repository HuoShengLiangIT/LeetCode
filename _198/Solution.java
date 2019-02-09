package _198;

public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] opt = new int[len+2];
        for(int i=0;i<len;i++){
            opt[i+2] = Math.max(opt[i+2-1],opt[i+2-2]+nums[i]);
        }
        return opt[len+1];
    }
}

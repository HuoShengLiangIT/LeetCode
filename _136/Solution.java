package _136;

public class Solution {
    public int singleNumber(int[] nums) {
        //11^11 = 0 Any number that is exclusive itself is 0
        int result = 0;
        for(int x:nums){
            result ^=x;
        }
        return result;
    }
}

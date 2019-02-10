package _167;

import java.util.HashMap;

public class Solution {
    /**
     * 通过HashMap构建映射，达到快速查找的目的，此题因为已经是升序数组，所以不推荐使用此方法
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = numbers.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i])+1,i+1};
            }
            int temp = target-numbers[i];
            map.put(temp,i);
        }
        return null;
    }
}

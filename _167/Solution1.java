package _167;

public class Solution1 {
    /**
     * 因为已经是有序的数组，所以通过二分查找来查找这两个数非常快速
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        while(s<e){
            int sum = numbers[s]+numbers[e];
            if(sum==target){
                return new int[]{s+1,e+1};
            }
            if(sum>target){
                e--;
            }else{
                s++;
            }
        }
        return null;
    }
}

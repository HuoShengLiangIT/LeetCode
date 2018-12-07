package _349;

import java.util.Arrays;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // get length of nums1 and nums2
        int len1 = nums1.length;
        int len2 = nums2.length;
        //len=0 There is no intersection
        if(len1==0||len2==0){
            return new int[0];
        }
        // must be len1>len2
        // becasue we need to find the longest array
        if(len1>=len2){
            int max=0;
            //select max number
            for(int i=0;i<len2;i++){
                if(nums2[i]>max){
                    max = nums2[i];
                }
            }
            boolean[] t = new boolean[max+1];
            //if nums2 contain e,t[e] is true else false
            for(int e:nums2){
                t[e] = true;
            }
            int i = 0;
            int[] result = new int[max+1];
            for(int e:nums1){
                //if e<max and t[e] = true,there is intersection
                if(e<=max){
                    if(t[e]){
                        t[e] = false;
                        result[i++] = e;
                    }
                }
            }
            //return range of [0,i)
            return Arrays.copyOf(result,i);
        }else{
            //exchange
            return intersection(nums2,nums1);
        }
    }
}

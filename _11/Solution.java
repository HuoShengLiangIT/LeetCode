package _11;

public class Solution {
    //Scan algorithm
    public int maxArea(int[] height) {
        int end = height.length - 1;
        int start = 0;
        int max = 0;
        while (end > start) {
            int area = (end - start) * Math.min(height[end], height[start]);
            max = Math.max(max, area);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }
}

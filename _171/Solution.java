package _171;

public class Solution {
    /**
     * 此题只需要按照字母的顺序进行迭代就可
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int len = s.length();
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum = sum*26+(s.charAt(i)-'A'+1);
        }
        return sum;
    }
}

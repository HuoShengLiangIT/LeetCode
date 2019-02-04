package _258;

public class Solution {
    /**
     * simple solution
     *
     * @param num original num
     * @return result num
     */
    public int addDigits(int num) {
        //i is the result
        int i = num;
        //if i>=10,continue to loop
        while (i >= 10) {
            //j is the num of middle result
            int j = i;
            //i init of 0
            i = 0;
            //loop of j,when it one bit is taken each time and then added to i
            while (j != 0) {
                i += j % 10;
                j = j / 10;
            }
        }
        //return result
        return i;
    }
}

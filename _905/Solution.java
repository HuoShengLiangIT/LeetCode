package _905;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        if (A == null) {
            return null;
        }
        int len = A.length;
        //Create a new integer array to receive the result
        int[] result = new int[len];
        //point to current even number
        int evenNumber = 0;
        //point to current odd number
        int oddNumber = len - 1;
        for (int i = 0; i < len; i++) {
            //this number of even number
            if (A[i] % 2 == 0) {
                result[evenNumber++] = A[i];
                //this number of odd number
            } else {
                result[oddNumber--] = A[i];
            }
        }
        //return result;
        return result;
    }
}

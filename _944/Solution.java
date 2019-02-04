package _944;

public class Solution {
    public int minDeletionSize(String[] A) {
        int len = A.length;
        int count = 0;
        int strlen = A[0].length();
        for (int i = 0; i < strlen; i++) {
            for (int j = 1; j < len; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

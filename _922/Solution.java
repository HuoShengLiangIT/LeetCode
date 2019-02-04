package _922;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        int s = 0;
        int e = 1;
        while ((s < len - 1) && (e < len)) {
            if (A[s] % 2 == 1 && A[e] % 2 == 0) {
                int t = A[s];
                A[s] = A[e];
                A[e] = t;
            }
            if (A[s] % 2 == 0) {
                s += 2;
            }
            if (A[e] % 2 == 1) {
                e += 2;
            }
        }
        return A;
    }
}

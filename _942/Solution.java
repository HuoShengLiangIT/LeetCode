package _942;

public class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length(), i = 0, j = N;
        int[] A = new int[N + 1];
        for (int k = 0; k < N; ++k)
            A[k] = S.charAt(k) == 'D' ? j-- : i++;
        A[N] = S.charAt(N-1)=='D'?j--:i++;
        return A;
    }
}

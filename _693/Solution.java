package _693;

public class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n % 2 == 0 ? 1 : 0;
        while (n != 0) {
            int t = n % 2;
            n >>= 1;
            if (t == x) {
                return false;
            }
            x = t;
        }
        return true;
    }
}

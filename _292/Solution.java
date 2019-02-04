package _292;

public class Solution {
    //According to the law
    public boolean canWinNim(int n) {
        if (n <= 0) {
            return false;
        }
        return !(n % 4 == 0);
    }
}

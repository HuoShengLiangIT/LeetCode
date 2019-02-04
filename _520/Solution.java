package _520;

import java.util.ArrayList;

public class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        //z is 90 in the ASCII code table
        //this if can judge uppercase letters
        for (char c : word.toCharArray()) if ('Z' - c >= 0) cnt++;
        //cnt==0:all letters are lowercase letters;cnt==word.length() all letters are uppercase letters
        //cnt==1&&'Z'-word.charAt(0)>=0:word have a uppercase letter and frist letter is uppercase
        return ((cnt == 0 || cnt == word.length()) || (cnt == 1 && 'Z' - word.charAt(0) >= 0));
    }
}

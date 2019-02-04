package _38;

public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String preString = countAndSay(n - 1);
        // System.out.println((n-1)+" :"+preString);
        StringBuilder curString = new StringBuilder();
        int len = preString.length();
        char t = preString.charAt(0);
        int count = 0;
        int i = 0;
        //process current string
        while (i < len) {
            char c = preString.charAt(i);
            if (t == c) {
                count++;
                i++;
            } else {
                curString.append(count).append(t);
                t = c;
                count = 0;
            }
        }
        curString.append(count).append(t);
        return curString.toString();
    }
}
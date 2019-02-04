package _925;

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] n = name.toCharArray();
        int i = 0;
        if (n[0] != typed.charAt(0)) return false;
        for (char c : typed.toCharArray()) {
            //if c==n[i]
            if (c == n[i]) {
                //if n[i]==n[i+1],it means that consecutive repeating characters appear.
                if (i + 1 < n.length && n[i] == n[i + 1]) {
                    i++;
                }
                //if c!=n[i] && c==n[i+1],it means that current c is next char of n
                // now i++
            } else if (i + 1 < n.length && c == n[i + 1]) {
                i++;
                //if c!=n[i]&& c!=n[i+1],it means no match
            } else {
                return false;
            }
        }
        //if i==n.length-1,it means that name can be found in typed
        return i == n.length - 1;
    }
}

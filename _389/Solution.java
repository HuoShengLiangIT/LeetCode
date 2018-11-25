package _389;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public char findTheDifference(String s, String t) {
        if(t==null||s==null||s==""||t==""){
            return 0;
        }
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int c = 0;
        for (int i = 0; i < sc.length; i++) {
            c^=sc[i];
        }
        for (int i = 0; i < tc.length; i++) {
            c^=tc[i];
        }
        return (char)c;
    }
}

package _859;

import java.util.Arrays;

public class Solution {
    public boolean buddyStrings(String A, String B) {
        int c = 0;
        int len1 = A.length();
        int len2 = B.length();
        if(len1!=len2){
            return false;
        }
        if(A.equals(B)){
            int[] r = new int[26];
            for(char ch:A.toCharArray()){
                r[ch-'a']++;
            }
            for(int i:r){
                if(i>1){
                    return true;
                }
            }
            return false;
        }else{
            int[] r1 = new int[26];
            for(char ch:A.toCharArray()){
                r1[ch-'a']++;
            }

            int[] r2 = new int[26];
            for(char ch:B.toCharArray()){
                r2[ch-'a']++;
            }

            if(Arrays.equals(r1,r2)){
                for(int i=0;i<len1;i++){
                    if(A.charAt(i)!=B.charAt(i)){
                        c++;
                    }
                }
                return c==2;
            }
            return false;
        }

    }
}

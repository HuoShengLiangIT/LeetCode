package _917;

public class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray())
            if (Character.isLetter(c)) sb.append(c);
        sb.reverse();
        for (int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if (Character.isLetter(c)) continue;
            sb.insert(i, c);
        }
        return sb.toString();
    }

}

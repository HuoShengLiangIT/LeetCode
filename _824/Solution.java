package _824;

public class Solution {
    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int len = strings.length;
        for (int i = 0; i < len; i++) {
            char[] x = strings[i].toCharArray();
            if (isVowel(x[0])) {
                stringBuilder.append(x);
                stringBuilder.append("ma");
            } else {
                int slen = x.length;
                stringBuilder.append(x, 1, slen - 1);
                stringBuilder.append(x[0]);
                stringBuilder.append("ma");
            }
            for (int j = 0; j < i + 1; j++) {
                stringBuilder.append('a');
            }
            if (i == len - 1)
                break;
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static boolean isVowel(char c) {
        c = new String(new char[]{c}).toLowerCase().charAt(0);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

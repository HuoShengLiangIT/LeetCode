package _13;

public class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int result = 0;
        char temp = 'A';
        for (int i = 0; i < len; i++) {
            char y = s.charAt(i);
            switch (y) {

                case 'M':
                    result += temp == 'C' ? 800 : 1000;
                    break;
                case 'D':
                    result += temp == 'C' ? 300 : 500;
                    break;
                case 'C':
                    result += temp == 'X' ? 80 : 100;
                    break;
                case 'L':
                    result += temp == 'X' ? 30 : 50;
                    break;
                case 'X':
                    result += temp == 'I' ? 8 : 10;
                    break;
                case 'V':
                    result += temp == 'I' ? 3 : 5;
                    break;
                case 'I':
                    result += 1;
            }
            temp = y;
        }
        return result;
    }
}

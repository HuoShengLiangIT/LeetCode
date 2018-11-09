package _824;

public class Solution {
    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int len = strings.length;
        for(int i=0;i<len;i++){
            String x = strings[i];
            if(isVowel(x.charAt(0))){
                stringBuilder.append(x+"ma");
            }else{
                int slen = x.length();
                for(int j=1;j<slen;j++){
                    stringBuilder.append(x.charAt(j));
                }
                stringBuilder.append(x.charAt(0));
                stringBuilder.append("ma");
            }
            for(int j=0;j<i+1;j++){
                stringBuilder.append('a');
            }
            if(i==len-1)
                break;
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    public static boolean isVowel(char c){
        c = new String(new char[]{c}).toLowerCase().charAt(0);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}

package _929;

import java.util.HashSet;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<String>();
        int len = emails.length;
        for (int i = 0; i < len; i++) {
            String x = emails[i];
            String[] email = x.split("@");
            StringBuilder b = new StringBuilder(email[0].split("\\+")[0]);
            int del = 0;
            while ((del = b.indexOf(".")) != -1) {
                b.deleteCharAt(del);
            }
            b.append(email[1]);
            set.add(b.toString());
        }
        return set.size();
    }
}

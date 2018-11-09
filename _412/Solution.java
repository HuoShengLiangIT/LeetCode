package _412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<String>(n);
        for(int i=1;i<=n;i++){
            if(i%3!=0&&i%5!=0){
                list.add(String.valueOf(i));
                continue;
            }
            StringBuilder s = new StringBuilder();
            if(i%3==0){
                s.append("Fizz");
            }
            if(i%5==0){
                s.append("Buzz");
            }
            list.add(s.toString());
        }
        return list;
    }
}

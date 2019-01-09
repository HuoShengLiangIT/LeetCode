package _914;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:deck){
            int val = map.getOrDefault(i,0)+1;
            map.put(i,val);
        }
        int temp = 0;
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()){
            int next = iterator.next();
            if(temp == 0){
                temp = next;
            }else{
                temp = gcd(temp,next);
            }
        }
        return temp>=2;
    }
    //G C D
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}

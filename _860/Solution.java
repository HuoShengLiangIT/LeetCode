package _860;

import java.util.LinkedList;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        LinkedList<Integer> five = new LinkedList<>();
        LinkedList<Integer> ten = new LinkedList<>();
        int len = bills.length;
        for(int i=0;i<len;i++){
            if(bills[i]==5){
                five.addFirst(1);
            }else if(bills[i]==10){
                if(five.size()==0){
                    return false;
                }else{
                    five.removeFirst();
                }
                ten.addFirst(1);
            }else{
                if(five.size()==0){
                    return false;
                }
                if(ten.size()==0&&five.size()<=2){
                    return false;
                }
                if(ten.size()==0&&five.size()>=3){
                    five.removeFirst();
                    five.removeFirst();
                    five.removeFirst();
                }else{
                    five.removeFirst();
                    ten.removeFirst();
                }

            }

        }
        return true;
    }
}

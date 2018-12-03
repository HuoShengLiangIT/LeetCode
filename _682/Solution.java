package _682;

import java.util.LinkedList;

public class Solution {
    public int calPoints(String[] ops) {
        int sumPoints = 0;
        int len = ops.length;
        //use LikedList simulate Stack
        LinkedList<Integer> result = new LinkedList<>();
        //loop ops
        for(int i=0;i<len;i++){
            String t = ops[i];
            //Switch statement judgment
            switch(t){
                //if "C" remove Stack top
                case "C":{
                    sumPoints-=result.removeLast();
                    break;
                }
                //if "D" get Stack top and multiply 2,and add result to Stack top
                case "D":{
                    sumPoints+=result.getLast()*2;
                    result.addLast(result.getLast()*2);
                    break;
                }
                //if "+" get Stack top and Stack top after element
                //add x1+x2 to Stack top
                case "+":{
                    int x1 = result.removeLast();
                    int x2 = result.getLast();
                    result.addLast(x1);
                    sumPoints+=x1;
                    sumPoints+=x2;
                    result.addLast(x1+x2);
                    break;
                }
                //if default , the String is an Integer
                default:{
                    int currentPoints = Integer.parseInt(t);
                    sumPoints+=currentPoints;
                    result.addLast(currentPoints);
                    break;
                }
            }
        }
        return sumPoints;
    }
}

package _896;

public class Solution {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if(len==1){
            return true;
        }
        int i=-1,j=0;
        while(A[++i]==A[++j]&&j<len-1);
        if(j==(len-1)){
            return true;
        }
        boolean increasing = A[i]>A[j]?false:true;
        for(int k=j;k<len;k++){
            if(increasing&&A[k]<A[k-1]){
                return false;
            }
            if(!increasing&&A[k]>A[k-1]){
                return false;
            }
        }
        return true;
    }
}

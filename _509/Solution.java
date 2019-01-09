package _509;

public class Solution {
    public int fib(int N) {
        int a=1,b=1;
        if(N==0){
            return 0;
        }
        if(N==1||N==2){
            return 1;
        }
        for(int i=2;i<N;i++){
            int temp = a+b;
            a = b;
            b= temp;
        }
        return b;
    }
}

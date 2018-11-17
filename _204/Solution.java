package _204;

public class Solution {
    public int countPrimes(int n){
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i=2;i<n;i++){
            //如果当前的数为素数则计数器+1
            if(notPrime[i]==false){
                count++;
                //然后将此数的所有2倍+以上的数都设为非素数
                for (int j = 2; j*i < n; j++) {
                    notPrime[j*i] = true;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(10));
    }
}

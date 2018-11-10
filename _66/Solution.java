package _66;

public class Solution {
        public int[] plusOne(int[] digits) {
            //获得其索引
            int idx = digits.length - 1;
            //是否需要进位
            boolean carry = true;
            //当需要进位并且idx指示器没有到最前面(第一位数)的时候，一直进行指示器移动
            while (idx >= 0 && carry) {
                //先判断此位是否需要进位
                carry = digits[idx] == 9;
                //当需要进位的时候+1，当进位的时候此位变为0
                digits[idx] = carry ? 0 : digits[idx] + 1;
                idx--;
            }
            //如果当处理全部的数字后还需要进位，说明原数组数据全为9，此时只需要
            //1.创建一个新的数组，数组长度为原数组+1
            //2.将第一位(0号下标)置位1即可其他为都为0
            if (carry) {
                int[] digitsOverflow = new int[digits.length + 1];
                digitsOverflow[0] = 1;
                return digitsOverflow;
            }
            return digits;
        }
}

package _933;

import java.util.ArrayList;

public class Solution {

}

class RecentCounter {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public RecentCounter() {

    }

    public int ping(int t) {
        list.add(t);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (t - list.get(i) <= 3000) {
                count++;
            }
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

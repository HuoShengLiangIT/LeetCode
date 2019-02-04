package _973;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        TreeMap<Integer, int[]> integerTreeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int len = points.length;
        for (int i = 0; i < len; i++) {
            int s = points[i][0];
            int e = points[i][1];
            integerTreeMap.put(s * s + e * e, points[i]);
        }
        int[][] result = new int[K][];
        Iterator<Map.Entry<Integer, int[]>> iterator = integerTreeMap.entrySet().iterator();
        for (int i = 0; i < K; i++) {
            result[i] = iterator.next().getValue();
        }
        return result;
    }
}

package util.mxmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Wuxinwei
 * @Date: 2021/4/26 14:43
 * @Description: 学习HashMap
 */
public class MxHashMap {

    public static void main(String[] args) {
        Map m = new HashMap();
        int i = tableSizeFor(7);
        System.out.println(i);

    }

    private static int tableSizeFor(int cap) {
        int MAXIMUM_CAPACITY = 1 << 30;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


}


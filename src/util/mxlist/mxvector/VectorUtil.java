package util.mxlist.mxvector;

import java.util.List;
import java.util.Vector;

/**
 * @Author: Wuxinwei
 * @Date: 2021/4/25 11:09
 * @Description: Vector
 *
 * 该类和ArrayList非常相似，但是该类是同步的，可以用在多线程的情况，该类允许设置默认的增长长度，默认扩容方式为原来的2倍。
 * 默认的容器是10 ，
 */
public class VectorUtil {
    public static void main(String[] args) {
        List list = new Vector<String>();
    }
}

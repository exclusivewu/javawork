package util.mxlist.mxvector;

import java.util.ArrayList;
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
        Vector vector = new Vector<String>(9);

        for (int i = 0; i < 4; i++) {
            vector.add(i+"");
        }
        // vector 的特定方法
        // 6 indexOf(Object o, int index) 代表查找

        // 5 capacity  获取容器的长度;
        System.out.println(vector.capacity());
        // 4 setSize 重新设置集合大小，比原来的大，扩容，比原来的小，就把多出的元素改为null

        // 3 ensureCapacity 扩容操作

        /*vector.ensureCapacity(10);
        System.out.println(vector);*/

        // 2 trimToSize 去掉vector 中多余的容量

        /*System.out.println(vector);
        System.out.println(vector.size());
        vector.trimToSize();
        System.out.println(vector);*/

        // 1 copyInto 复制vector的元素到参数数组上,前提是vector中的元素需要和数组长度保持一致

        /*String[] anArray=new String[4];
        anArray[0] = "100";
        anArray[1] = "100";
        anArray[2] = "100";
        anArray[3] = "100";
        vector.copyInto(anArray);
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }*/


        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9
        // 10
        // 11
        // 12
        // 13
        // 14
        // 15
        // 16
    }
}

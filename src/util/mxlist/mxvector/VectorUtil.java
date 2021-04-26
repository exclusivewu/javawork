package util.mxlist.mxvector;

import java.util.ArrayList;
import java.util.Arrays;
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

        // 剩下的需要在学习lamdba表达式的时候进行学习  涉及到多线程

        // 10 截取数组的方法

        List c = vector.subList(1,3); //12
        System.out.println(c);

        // 9 toArray() 转化为数组

        /*Object[] ss = vector.toArray();
        // object数组转化成String数组
        String str[]= Arrays.copyOf(ss, ss.length, String[].class);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }*/

        // 8 clone() 克隆操作
        /*
        Vector vector1 = (Vector) vector.clone();
        System.out.println(vector1);
        */

        // 7 ElementAt 操作

        /*setElementAt(E obj, int index) 修改元素
        removeElementAt(int index) 删除某个节点
        insertElementAt(E obj, int index) 插入某个节点
        lastElement() 返回末节点
        firstElement() 返回首节点
        elementAt(int index) 返回index 的元素 ，没有就返回异常
        addElement(E obj) 新增
        removeElement(Object obj) 删除
        removeAllElements() 删除全部元素*/

        // 6 indexOf(Object o, int index) 从index开始查询 lastIndexOf(Object o, int index) 倒叙，查找index之前的数据

        // 5 capacity  获取容器的长度;

        // System.out.println(vector.capacity());

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

    }
}

package util.mxlist.mxarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Author: Wuxinwei
 * @Date: 2021/4/21 22:18
 * @Description: list集合
 */
public class ArrayListUtil {

    public static void main(String[] args) {
        List list = new ArrayList<String>();
        List vector = new Vector<String>();
        for (int i = 0; i < 6; i++) {
            list.add(i+"");
            vector.add(i+"");
        }
        List list1 = new ArrayList<String>();
        List vector1 = new Vector<String>();
        for (int i = 0; i < 3; i++) {
            list1.add(i+"");
            vector1.add(i+"");
        }
        // 方法1 add(int index, E element)
        list.add(3,"插入值");
        vector.add(3,"插入值");
        // 在索引3处插入元素，结果应该是["0","1","2","插入值","3","4","5"]
        // 源码操作如下

    /*public void add(int index, E element) {
        // 先判断index索引是否越界
        rangeCheckForAdd(index);
        // 判断size+1是否大于数组的最大容量，如果大于，扩容1.5倍，如果还大于，就把size+1赋值给容量。
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        // 数组整体移动  index 长度为size-index 整体移动到index+1的位置，
        System.arraycopy(elementData, index, elementData, index + 1,
                size - index);
        // index位置赋值给index
        elementData[index] = element;
        size++;
    }*/

        // 方法2 list.retainAll(list1)
        /**
         *   list和list1两者取交集，并且赋值给list
         */

        // 方法3 list.containsAll(list1);
        //  list.contains("3");
        // 检测list中是否包含list1，或者"3",但是不取交集。

        // 方法4 list.subList(1,3)
        // list.subList(1,3), 截取数组，两个参数是开始索引，结束索引，包括开始索引，不包括结束索引

        // 方法5 list.toArray(); 集合转换成数组

        // 方法6 迭代器 待定
        //list.spliterator();

        // 方法7 迭代器 待定
        // list.listIterator();
        // 方法8 迭代器 待定
        // list.iterator();


        // 方法9 list.sort(); 待定

        // 方法10 自己替换自己 中间用 -> 来赋值
        // list.replaceAll(a->a+"h");

        // 方法11 判断是否为空 ，为空时返回null。实际是判断size的值
        // list.isEmpty();

        // 方法12 最后一个出现"3"的索引
        // list.lastIndexOf("3");

        //方法13 获取集合的hashcode值。
        //System.out.println(list.hashCode());
        //System.out.println(vector.hashCode());

        //方法14 equals 比较两个集合地址是否相同
        //System.out.println(list.equals(list));
        //方法15 待定 不知道是啥
        //list.parallelStream();

        //方法16  根据条件删除
        //list.removeIf(a -> a.equals("3h"));

        //方法17  jdk8新特性
        //list.stream();
        //方法18 list.forEach(); 根据条件来循环

        //list.forEach(item->System.out.print(item));
        //方法19

        //list.getClass();
        //System.out.println(list.getClass());
        //方法20 线程的相关事情
        //list.notify();
        // 方法21 线程的相关事情
        // list.notifyAll();
        // list.wait();


    }

}

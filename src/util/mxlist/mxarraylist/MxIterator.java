package util.mxlist.mxarraylist;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: Wuxinwei
 * @Date: 2021/4/23 11:35
 * @Description: 集合的迭代器
 */
public class MxIterator {
    public static void main(String[] args) {
       /* ArrayList<String> a = new ArrayList<String>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println("Before iterate : " + a);
        ListIterator<String> it = a.listIterator();
        while (it.hasNext()) {
               System.out.println(it.next() + ", " + it.previousIndex() + ", " + it.nextIndex());
        }
        while (it.hasPrevious()) {
               System.out.print(it.previous() + " ");
        }
        System.out.println();
        it = a.listIterator(1);//调用listIterator(n)方法创建一个一开始就指向列表索引为n的元素处的ListIterator。
        while (it.hasNext()) {
            String t = it.next();
            System.out.println(t);
            if ("ccc".equals(t)) {
                it.set("nnn");
            } else {
                it.add("kkk");
            }
        }
        System.out.println("After iterate : " + a);*/

        List list = new ArrayList();
        list.add("wxw");
        list.add("cx");
        list.add("lixin");
        ListIterator<String> listIterator = list.listIterator();
        // 正序排列
        /*while (listIterator.hasNext()){
            String str = listIterator.next();
            listIterator.add("1");
            if (str.equals("cx")){
                listIterator.remove();
            }
            System.out.println(str);
            System.out.println(listIterator.previousIndex());
            System.out.println(listIterator.nextIndex());
        }*/
        // 倒叙排列
        /*while (listIterator.hasPrevious()){
            String str = listIterator.previous();
            System.out.println(str);
        }*/
        // 创建一个带有索引的迭代器
        /*ListIterator<String> listIterator1 = list.listIterator(1);
        while (listIterator1.hasPrevious()){
            String str = listIterator1.previous();
            System.out.println(str);
        }*/

        // jdk1.8的新特性迭代器，在多线程的下使用。
        // 这个就是用来多线程并行迭代的迭代器，这个迭代器的主要作用就是把集合分成了好几段，每个线程执行一段，因此是线程安全的。
        // 先学习多线程，再回头来学习集合的相关知识
        list.spliterator();
    }
}

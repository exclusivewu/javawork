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
        List list = new ArrayList<String>();
        for (int i = 0; i < 7; i++) {
            list.add(i+"");
        }
        // Iterator 基础的迭代器  基础方法有三个  hashnext next remove
       /* Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object str = iterator.next();
            System.out.println(str);
            if (str.equals("1")){
                iterator.remove();
            }
        }
        System.out.println(list);*/
        // ListIterator 集合特有的迭代器
        ListIterator listi = list.listIterator();
        while (listi.hasNext()){
            Object c = listi.next();
            System.out.println(c);
        }
        /*listi.add("5");
        listi.add("6");*/
        System.out.println(list);

        // 迭代器倒叙
        while(listi.hasPrevious()){
            Object value = listi.previous();
            System.out.print(value+" ");
        }


    }
}

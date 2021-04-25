package util.mxlist.mxlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Wuxinwei
 * @Date: 2021/4/21 22:17
 * @Description:
 */
public class LinkelistUtil {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<String>();
        list.add("wxw");
        list.add("cx");
        list.add("lx");

        list.removeIf(e -> e.equals("wxw"));
        // 添加元素到开头
        list.addFirst("dxl");
        // 添加元素到结尾
        list.addLast("haha");
        // 删除首元素
        list.removeFirst();
        // 删除末节点元素
        list.removeLast();
        // 获取首节点
        list.getFirst();
        // 获取未节点
        list.getLast();
        list.offer("123"); // 链表尾部新增数据
        System.out.println(list);





    }


}

package util.mxlist.mxlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: Wuxinwei
 * @Date: 2021/4/21 22:17
 * @Description: 线程不安全，链表的存储，可以存null
 */
public class LinkelistUtil {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<String>();
        list.add("wxw");
        list.add("cx");
        list.add("lx"); // 新增最后一个节点
        // linkedlist的新增操作 实际上调用的是add
        list.offer("1");  // 新增末节点返回是否成功
        list.offerFirst("0");  //新增首节点返回是否成功
        list.offerLast("2");  //返回是否成功
        list.push("1");  //新增首节点 队列多用这个功能


        // 删
        list.removeLast();  // 删除最后一个元素 集合为空时抛异常
        list.remove();    // 删除第一个元素 集合为空时抛异常
        list.poll();    //  删除第一个元素 集合为空时返回null
        list.pollFirst();  //删除第一个元素 集合为空时返回null
        list.pollLast();   //删除最后一个元素 集合为空时返回null
        list.pop();  // 删除首元素，集合为空时抛异常

        // 查
        list.get(1); // 如果链表为空 抛出异常
        list.getLast(); // 返回最后一个元素。 如果链表为空 抛出异常
        list.getFirst(); // 返回第一个元素。 如果链表为空 抛出异常
        list.peek();  // 返回第一个元素 如果链表为空 抛出异常
        list.peekFirst(); // 返回头部元素 如果链表为空 抛出异常
        list.peekLast(); // 返回尾部元素。 如果链表为空 抛出异常
        list.element(); // 返回第一个元素。 如果链表为空 返回null

        // 特有的迭代器
        // 正序排列
        ListIterator<String> lter = list.listIterator();
        while (lter.hasNext()){
            System.out.println(lter.next());
        }
        // 倒叙排列
        while (lter.hasPrevious()){
            String str = lter.previous();
            System.out.println(lter.previousIndex());
            System.out.println(lter.nextIndex());
            //lter.set("set");
            System.out.println(str);
        }

        // 用linkedlst实现栈和队列

        // 队列 先进先出

        /*private void useLinkedListAsFIFO() {
            // 新建一个LinkedList
            LinkedList queue = new LinkedList();

            // 将10,20,30,40添加到队列。每次都是插入到末尾
            queue.add("10");
            queue.add("20");
            queue.add("30");
            queue.add("40");

            // 打印“队列”
            System.out.println("queue:"+queue);

            // 删除(队列的第一个元素)
            System.out.println("queue.remove():"+queue.remove());

            // 读取(队列的第一个元素) 为空时返回null
            System.out.println("queue.element():"+queue.element());

            // 打印“队列”
            System.out.println("queue:"+queue);
        }*/

        //栈 先进后出
        /*private void useLinkedListAsLIFO1() {
            // 新建一个LinkedList
            LinkedList stack = new LinkedList();

            // 将1,2,3,4添加到堆栈中
            stack.push("1");
            stack.push("2");
            stack.push("3");
            stack.push("4");

            // 打印“栈”   4321
            System.out.println("stack:"+stack);

            // 删除“栈顶元素” 为空时抛异常
            System.out.println("stack.pop():"+stack.pop());

            // 取出“栈顶元素”  为空时为null
            System.out.println("stack.peek():"+stack.peek());

            // 打印“栈”
            System.out.println("stack:"+stack);
        }*/

    }


}

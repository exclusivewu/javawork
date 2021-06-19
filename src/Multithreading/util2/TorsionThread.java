package Multithreading.util2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 11:54
 * @Description: 定义一个多线程类，乌龟
 */
public class TorsionThread extends Thread{
    // 重写一个线程的run方法

    @Override
    public void run() {
        // this.setName("乌龟线程");  // 指定线程的名字，尽量不要再这里定义，因为创建两个TorsionThread线程时，无法区分
        // this.setPriority(Thread.MAX_PRIORITY);  // 指定一下优先级别
        while (true){
            System.out.println("乌龟领先了，加油"+this.getName()+", "+this.getPriority()); // 名称和优先级别
        }
    }
}

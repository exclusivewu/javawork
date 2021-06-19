package Multithreading.util2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 14:05
 * @Description: 启动线程类
 *
 * 总结一下  ：启动一个线程类，第一种方法，继承一个Thread类，重写run方法。
 *
 * Thread.currentThread()  得到当前的线程
 */
public class TestThread {
    public static void main(String[] args) {

        // 启动乌龟的线程
        Thread thread = new TorsionThread();
        thread.setName("乌龟线程");  // 指定线程的名字，
        thread.setPriority(Thread.MAX_PRIORITY);  // 指定一下优先级别
        // thread.run();   // 普通的方法调用，不是线程的调用
        thread.start();   // 启动了一个新的线程
        // 兔子也在跑
        while (true){
            System.out.println("兔子领先了，加油"+Thread.currentThread().getName()+" ,"+Thread.currentThread().getPriority());
        }



    }
}

package Multithreading.util2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/17 20:37
 * @Description: 实现多线程的几种方式
 */
public class Demo {
    /**通过继承来实现多线程*/
    public static class MyThread extends Thread {
        /*
        *重写线程体，也就是线程需要执行的任务
        *
        * */
        @Override
        public void run() {
            while (true) {
                System.out.println("乌龟领先了，加油");
            }

        }
    }

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
    }

    /**在调用了start()方法之后，线程才开始启动。

    * 我们在调动start()方法之后，虚拟机会先为我们创建一个线程，然后等到这个线程
    * 的第一次得到时间片时再调用run()方法。
    *
    * 注意不可以多次调用start()方法，在第一次调用start方法后，再次调用start方法会抛异常
    * */




}

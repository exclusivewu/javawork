package Multithreading.util2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 14:34
 * @Description:
 *  总结：实现多线程方式2，定义一个类实现runnable接口，实现run方法，
 *  创建一个线程的对象，把任务传递进去
 *
 *
 *  两种方式的比较：
 *  继承：编程简单，但是单继承
 *  实现，编程复杂，可以多继承其他类， 有利于多个线程共享同一个资源
 *  runnable接口的出现更符合面向对象，将线程单独进行对象的封装，
 *  runnable接口的出现，降低了线程对象和线程任务之间的耦合性。
 *  使用接口，不需要使用thread类的诸多方法，更加轻量级
 *
 *
 *
 *
 *
 */
public class TestRunnable {
    public static void main(String[] args) {
        // 启动两个乌龟来跑
        TorsionRunnable torsionRunnable = new TorsionRunnable();

        // 也可以通过匿名内部类来实现
        /**
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    while (true) {
                        System.out.println("乌龟领先了，加油"+Thread.currentThread().getName()+", "+Thread.currentThread().getPriority());
                    }
                }
            }
        };
        Thread thread = new Thread(runnable,"乌龟1");  // 创建线程，利用构造方法
        */
        Thread thread = new Thread(torsionRunnable,"乌龟1");  // 创建线程，利用构造方法
        Thread thread1 = new Thread(torsionRunnable,"乌龟2");  // 创建线程，利用构造方法
        thread.setPriority(Thread.NORM_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread1.start();
        // 兔子也在跑
        while (true){
            System.out.println("兔子领先了，加油"+Thread.currentThread().getName()+" ,"+Thread.currentThread().getPriority());
        }
    }
}

package Multithreading.util5.syn1;

import Multithreading.util5.syn1.ConsumeRunnable;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/19 10:16
 * @Description: 测试类
 *
 * 问题 1，没有商品类，
 * 问题 2，没有线程交互   可以远程通信 通过从object类继承的 final  wait和 notifyAll。notify
 * 问题 3，生产者可以生产商品，消费者只能消费null
 *  保证生产者和消费者是一个商品对象,可以用构造器或者getset方法来传递
 *
 *  问题4，加上sleep后，出现了白色玉米饼和黄色馒头的问题。需要进行线程同步 利用同步代码块的形式。
 *  对消费者和生产者都要加锁，并且都要是同一把锁，才能保持同步
 *
 *  注意事项，必须调用同步监视器product 的final  wait和 notifyAll。notify方法 就是锁的
 *
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        // 创建两个线程
        Runnable runnable1 = new ProduceRunnable(product);
        Runnable runnable2 = new ConsumeRunnable(product);
        Thread produce = new Thread(runnable1);
        Thread consume = new Thread(runnable2);
        // 启动线程
        produce.start();
        consume.start();
    }
}

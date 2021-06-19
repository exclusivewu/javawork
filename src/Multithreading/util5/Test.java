package Multithreading.util5;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/19 10:16
 * @Description: 测试类
 *
 * 问题 1，没有商品类，
 * 问题 2，没有线程交互
 * 问题 3，生产者可以生产商品，消费者只能消费null
 *  保证生产者和消费者是一个商品对象,可以用构造器或者getset方法来传递
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

package Multithreading.util4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 21:45
 * @Description: 同步方法第三种，使用lock锁
 */
public class Syn3 implements Runnable{
    private Account account = new Account();
    // 先买一把锁
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {

        // 上锁   运行过程中程序出现异常，也要解锁，再往上抛异常。之前的方法都是自动解锁，现在需要手动
        // 同一个锁，锁住不同方法，可以重复进，会记录数。
        lock.lock();
        try {
            if (account.getimat() >= 400){  // 如果余额大于400 就取款
                try {
                    Thread.sleep(10); // 故意放大错误，让一个线程阻塞，一般是用来暴露问题的
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.wait(400);
                System.out.println(Thread.currentThread().getName()+"取款成功，当前余额为"+account.getimat());
            } else {
                System.out.println(Thread.currentThread().getName()+"余额不足，当前余额为"+account.getimat());
            }
        }finally {
            // 用完了，就要解锁
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        // 创建两个线程，模拟两个用户
        Runnable runnable = new Syn1();
        Thread thread1 = new Thread(runnable,"张三");
        Thread thread2 = new Thread(runnable,"张三妻子");
        thread1.start();
        thread2.start();


    }
}

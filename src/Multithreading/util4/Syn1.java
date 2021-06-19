package Multithreading.util4;
/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 20:22
 * @Description: 解决多线程的问题，第一种解决方案 synchronized关键字 同步代码块
 *
 * 实现的原理 ：  如果一把锁同时同步
 *   总结1
 *
 *
 */
public class Syn1 implements Runnable{
    private Account account = new Account();
    @Override
    public void run() {
        synchronized (account){  // 通过synchronized关键字，同步代码块
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

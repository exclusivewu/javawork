package Multithreading.util4;
/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 20:22
 * @Description: 解决多线程的问题，第二种解决方案 同步方法 比同步代码块效率低 线程挡在了方法之外。
 *  不能直接给run加锁，同步的时候一个同步方法的锁锁住，就代表所有的同步方法的锁锁上，因为锁是当前对象this
 *  能不用就不用
 *
 *  非静态同步方法的锁，是当前对象。
 *  如果静态方法加锁，锁就是类名.class 类对象
 *
 */
public class Syn2 implements Runnable{
    private Account account = new Account();
    @Override
    public void run() {
        with();

    }
    /**非静态同步方法的锁是this，当前对象*/
    public synchronized void with(){
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

    public static void main(String[] args) {
        // 创建两个线程，模拟两个用户
        Runnable runnable = new Syn2();
        Thread thread1 = new Thread(runnable,"张三");
        Thread thread2 = new Thread(runnable,"张三妻子");
        thread1.start();
        thread2.start();


    }
}

package Multithreading.util4;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 20:22
 * @Description: 银行操作类
 */
public class AccountTest {
    public static void main(String[] args) {
        // 创建两个线程，模拟两个用户
        Runnable runnable = new AccountRunnable();
        Thread thread1 = new Thread(runnable,"张三");
        Thread thread2 = new Thread(runnable,"张三妻子");
        thread1.start();
        thread2.start();


    }
}

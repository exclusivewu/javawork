package Multithreading.util4;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 20:22
 * @Description: 银行多线程类，实现一个runnable接口
 */
public class AccountRunnable implements Runnable{
    private Account account = new Account();
    /**
     * 线程体，取款的步骤
     * */
    @Override
    public void run() {
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

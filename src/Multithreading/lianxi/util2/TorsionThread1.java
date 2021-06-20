package Multithreading.lianxi.util2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/20 14:25
 * @Description: 通过继承Thread类来实现多线程,
 */
public class TorsionThread1 extends Thread{
    // 重写run方法
    @Override
    public void run() {
        while (true) {
            System.out.println(this.getName()+"正在运行"+this.getPriority());
        }
    }

    public static void main(String[] args) {
        Thread thread = new TorsionThread1();
        Thread thread1 = new TorsionThread1();
        thread.setName("武鑫伟");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setName("李信");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread1.start();
        // 主函数赋值
        Thread.currentThread().setName("主函数线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        // 主函数的线程启动
        while (true) {
            System.out.println(Thread.currentThread().getName()+"正在运行"+Thread.currentThread().getPriority());
        }

    }
}

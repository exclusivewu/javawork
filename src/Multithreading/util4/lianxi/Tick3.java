package Multithreading.util4.lianxi;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 22:05
 * @Description:
 */
public class Tick3 implements Runnable{

    private int number = 100;
    @Override
    public void run() {
        while (number > 0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+number+"张票");
            number--;
        }

    }

    public static void main(String[] args) {
        // 创建四个线程
        Runnable runnable = new Tick3();
        Thread thread1 = new Thread(runnable,"售票员1");
        Thread thread2 = new Thread(runnable,"售票员2");
        Thread thread3 = new Thread(runnable,"售票员3");
        Thread thread4 = new Thread(runnable,"售票员4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}

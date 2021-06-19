package Multithreading.util4.lianxi;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 22:05
 * @Description:
 */
public class tick1 implements Runnable{

    private int number = 100;
    Map m = new HashMap<>();
    @Override
    public void run() {
        while (true){
            synchronized (m){
                if (number < 1){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖出了第"+number+"张票");
                number--;
            }
        }


    }

    public static void main(String[] args) {
        // 创建四个线程
        Runnable runnable = new tick1();
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

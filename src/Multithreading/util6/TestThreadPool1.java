package Multithreading.util6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/21 10:59
 * @Description: 使用线程池执行大量的runnable命令
 */
public class TestThreadPool1 {

    public static void main(String[] args) {

        // 创建一个线程池
        // 使用工具类创建线程池

        //这个线程池中只有一个线程，
        //ExecutorService pool1 =  Executors.newSingleThreadExecutor();
        // 这个线程池中有固定数量线程，
        //ExecutorService pool2 = Executors.newFixedThreadPool(10);
        // 这个线程池中有数量动态变化，
        // ExecutorService pool3 = Executors.newCachedThreadPool();
        // Scheduled 定时任务，用来执行大量的定时任务（间隔执行）
        // ExecutorService pool4 = Executors.newScheduledThreadPool(10);

        // 手动创建线程池
        //ExecutorService pool5 = new ThreadPoolExecutor()
        // 使用线程池，执行大量的runnable命令
        for (int i = 0; i < 20; i++) {

            Runnable runnable = new MyRunnable(i);
           /* 原先的创建线程方法
            Thread thread = new Thread(runnable);
            thread.start();
            */

            // 用线程池1
            // pool1.execute(runnable);
            // 用线程池2
            //pool2.execute(runnable);
            // 用线程池3
            //pool3.execute(runnable);
            // 用线程池2
            //pool3.execute(runnable);


        }

        // 关闭线程池
        /*pool1.shutdown();
        pool2.shutdown();
        pool3.shutdown();
        pool4.shutdown();*/
    }

}

class MyRunnable implements Runnable{
    private int i;
    MyRunnable(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("任务"+i+"开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务"+i+"结束");

    }
}

package Multithreading.util6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/21 10:59
 * @Description: 使用线程池执行大量的callable任务
 */
public class TestThreadPool2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建一个线程池
        // 使用工具类创建线程池

        //这个线程池中只有一个线程，
        // ExecutorService pool1 =  Executors.newSingleThreadExecutor();
        // 这个线程池中有固定数量线程，
        // ExecutorService pool2 = Executors.newFixedThreadPool(10);
        // 这个线程池中有数量动态变化，
        ExecutorService pool3 = Executors.newCachedThreadPool();
        // Scheduled 定时任务，用来执行大量的定时任务（间隔执行）
        // ExecutorService pool4 = Executors.newScheduledThreadPool(10);

        List<Future> futureList = new ArrayList<Future>();

        // 手动创建线程池
        //ExecutorService pool5 = new ThreadPoolExecutor()
        // 使用线程池，执行大量的runnable命令
        for (int i = 0; i < 20; i++) {
            int n = i;
            // Callable callable = new MyCallable();

            // 使用匿名内部类的方法
            Callable<Integer> callable = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    System.out.println("线程"+n+"开始");
                    int result = new Random().nextInt(10);
                    Thread.sleep(1000);
                    System.out.println("线程"+n+"结束");
                    return result;
                }
            };


            // 用线程池1
            Future<Integer> future = pool3.submit(callable);
            // get方法的存在，使得线程池不能并发运行。必须等到获得返回值。解决办法就是分任务
            // int result = future.get();
            // System.out.println(result);
            futureList.add(future);
            // 用线程池2
            //pool2.execute(runnable);
            // 用线程池3
            //pool3.execute(runnable);
            // 用线程池2
            //pool3.execute(runnable);
        }

        for (int i = 0; i < 20; i++) {
            Future future = futureList.get(i);
            System.out.println(future.get());

        }

        // 关闭线程池
        pool3.shutdown();
        //pool2.shutdown();
        //pool3.shutdown();
        //pool4.shutdown();
    }

}

// 如果不提供这个类，可以使用匿名内部类
/*class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}*/

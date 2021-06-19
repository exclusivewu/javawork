package Multithreading.util2;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 15:00
 * @Description: 第三种创建多线程方法 主要是拥有返回值
 */
public class RundonCollable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
       /* if(true){
            throw new Exception();
        }*/
        // 返回10以内的随机数
        Thread.sleep(6000);
        return new Random().nextInt(10);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*创建一个线程对象*/
        Callable<Integer> callable = new RundonCollable();

        // FutureTask 第一个作用，作为runnable的存在。第二个作用，获取返回值

        FutureTask<Integer> task = new FutureTask<>(callable);
        // 启动线程对象
        Thread thread = new Thread(task,"线程1");
        thread.start();
        System.out.println(task.isDone()); // 显示线程是否结束
        //int f = task.get(); // 得到返回值之后才执行完成,一根筋，等不到返回值就一直等待
        // 如果等不到，就抛异常
        // 也可以指定等待时间为3秒
        int f = 0;
        try {
            f = task.get(3, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println(task.isDone()); // 显示线程是否结束
        System.out.println(f);
    }
}

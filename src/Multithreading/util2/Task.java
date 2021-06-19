package Multithreading.util2;

import java.util.concurrent.*;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 10:28
 * @Description: callable接口，和runnable接口类似，但是callable接口
 * 接口提供有返回值，支持泛型。
 * callable接口，一般都是配合线程池工具，
 */
public class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // 模拟计算需要一秒
        Thread.sleep(1000);
        return 2;
    }

    public static void main(String[] args) {
        // 使用线程池
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        // 调用get方法会阻塞当前线程，知道得到结果
        // 所以在实际的编码中，建议使用可以设置超时时间的重载get方法。
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

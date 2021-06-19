package Multithreading.util2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/17 20:56
 * @Description:
 */
public class Demo1 {
    /**通过实现接口Runnable来实现多线程*/
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }

    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }
}

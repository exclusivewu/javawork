package Multithreading.util2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 14:29
 * @Description: 第二种创建方式，实现runnable接口
 */
public class TorsionRunnable implements Runnable{

    @Override
    public void run() {
        while (true) {
            while (true) {
                System.out.println("乌龟领先了，加油"+Thread.currentThread().getName()+", "+Thread.currentThread().getPriority());
            }
        }
    }
}

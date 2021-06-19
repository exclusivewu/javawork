package Multithreading.util3;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 19:43
 * @Description: 让当前正在执行的线程暂停，不是阻塞线程，而是将线程转入就绪状态，如果调用了yield，
 * 但是没有其他等      待的线程，就马上恢复运行。
 */
public class YieldTest extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=200){
            Thread.yield();
            System.out.println("乌龟领先了，加油"+this.getName()+", "+this.getPriority()+" "+i); // 名称和优先级别
            i++;
        }
    }

    public static void main(String[] args) {
        Thread thread = new YieldTest();
        thread.start();
        // 兔子也在跑
        int i = 0;
        while (i <=200){
            Thread.yield();
            System.out.println("兔子领先了，加油"+Thread.currentThread().getName()+" ,"+Thread.currentThread().getPriority()+" "+i);
            i++;
        }
    }
}

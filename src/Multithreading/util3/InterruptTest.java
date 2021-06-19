package Multithreading.util3;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 19:59
 * @Description: 主要是并没有直接中断线程，而是需要被中断线程自己处理。（软关机
 */
public class InterruptTest extends Thread{
    @Override
    public void run() {
        while (!this.isInterrupted()){  // 在run方法中进行判断，是否被中断
            System.out.println("乌龟哈哈领先了，加油"+this.getName()+", "+this.getPriority()); // 名称和优先级别
        }
    }

    public static void main(String[] args) {
        Thread thread = new InterruptTest();
        // thread.setDaemon(true);  // 改成后台线程，后台结束，就线程结束
        thread.start();
        // 兔子也在跑
        int i = 0;
        while (i <=200){
            System.out.println("兔子领先了，加油"+Thread.currentThread().getName()+" ,"+Thread.currentThread().getPriority()+" "+i);
            i++;
        }
        thread.interrupt();  // 并不是结束线程，只是修改了线程，需要线程进行检查线程。
    }
}

package Multithreading.util3;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 19:36
 * @Description: 实现乌龟和兔子的交替运行
 */
public class Sleeptest extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=200){
            try {
                Thread.sleep(1); // 每运行一次睡眠1毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("乌龟领先了，加油"+this.getName()+", "+this.getPriority()+" "+i); // 名称和优先级别
            i++;
        }
    }

    public static void main(String[] args) {
        Thread thread = new Sleeptest();
        thread.start();
        // 兔子也在跑
        int i = 0;
        while (i <=200){
            try {
                Thread.sleep(1); // 每运行一次睡眠1毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子领先了，加油"+Thread.currentThread().getName()+" ,"+Thread.currentThread().getPriority()+" "+i);
            i++;
        }
    }
}

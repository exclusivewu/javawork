package Multithreading.util3;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 16:52
 * @Description:
 */
public class JoinTest extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<=200){
            System.out.println("乌龟领先了，加油"+this.getName()+", "+this.getPriority()+" "+i); // 名称和优先级别
            i++;
        }
    }

    public static void main(String[] args) {
        /*Thread thread = new JoinTest();
        thread.start();*/
        // 兔子也在跑
        int i = 0;
        while (i <=200){
            if (i == 50) {
                // 半路杀出程咬金，必须先把乌龟执行完再执行兔子
                Thread thread = new JoinTest();
                thread.start();
                try {
                    thread.join();  // 阻塞了兔子，乌龟执行完，兔子才有机会
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("兔子领先了，加油"+Thread.currentThread().getName()+" ,"+Thread.currentThread().getPriority()+" "+i);
            i++;
        }
    }
}

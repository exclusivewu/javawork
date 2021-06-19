package Multithreading.util3;

import Multithreading.util2.TorsionRunnable;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 19:48
 * @Description: 把指定的线程设置为后台线程，创建后台线程的线程结束后，后天线程也会随之消亡，
 *  只有在线程启动之前      把它设为后台线程。
 */
public class SetDaemonTest extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("乌龟哈哈领先了，加油"+this.getName()+", "+this.getPriority()); // 名称和优先级别
            }
        }

        public static void main(String[] args) {
        Thread thread = new SetDaemonTest();
        thread.setDaemon(true);  // 改成后台线程，后台结束，就线程结束
        thread.start();
            // 兔子也在跑
            int i = 0;
            while (i <=200){
                System.out.println("兔子领先了，加油"+Thread.currentThread().getName()+" ,"+Thread.currentThread().getPriority()+" "+i);
                i++;
            }
        }
    }

package Multithreading.util3;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/18 16:06
 * @Description:
 * 2.线程的控制
 *     在理解线程生命周期的基础上，可以使用java提供的线程控制命令对线程的生命周期进行干预
 *     1 ,  join()
 *     阻塞指定线程等到另一个线程完成以后再继续执行。
 *     2，sleep()
 *     使线程停止运行一段时间，让出cpu，将处于柱塞状态。如果调用了sleep.就算没有其他等待的线程，
 *     这个线程也不会马上恢复执行。（实际开发中经常使用Thread.sleep()来模拟线程切换，暴露线程的安全问        题）
 *     3， yield
 *     让当前正在执行的线程暂停，不是阻塞线程，而是将线程转入就绪状态，如果调用了yield，但是没有其他等      待的线程，就马上恢复运行。
 *     4， setDaemon()
 *     把指定的线程设置为后台线程，创建后台线程的线程结束后，后天线程也会随之消亡，只有在线程启动之前      把它设为后台线程。
 *     5，interrupt()
 *     并没有直接中断线程，而是需要被中断线程自己处理。（软关机）
 *     6， stop()
 *     结束线程，不推荐使用。 （硬关机）
 */
public class gainian {
}
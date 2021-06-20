package Multithreading.lianxi.util1;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/20 9:42
 * @Description: 练习，多线程的原理，进程与线程的关系。
 */
public class summary {
    /**
    进程与线程的区别：
     本质的区别：进程是一个独立的运行环境，而线程是在进程中执行的一个任务，他们两个本质的区别是
     是否单独占有内存地址空间以及其他空间资源。
     1.进程单独占有一定的内存地址空间，所以进程间存在内存隔离，数据是分开的。数据共享复杂
     但是同步简单，各个进程之间互不干扰。而线程共享数所属于的进程占用的内存地址空间和资源，数据共享简单，
     但是同步复杂。
     2.进程单独占有内存空间，一个进程出现问题，不会影响其他进程，不影响主程序的使用，可靠性高。
     一个线程出现问题，可能会影响整个程序的稳定性，可靠性低。
     3.进程单独占有内存空间，进程的创建和销毁不仅要保存寄存器和栈的信息，还需要资源的回收和叶调度，开销比较大，
     线程只需要保存寄存器和栈的信息。

     上下文切换问题：

     上下文切换是一个进程（或者线程）切换到另一个进程（或者线程），上下文是指某一个时间点cpu寄存器和程序计数器的内容。

     cpu寄存器：
        cpu寄存器是指在cpu中少量速度很快的闪存，用来存储和访问计算过程中的中间值，来提高计算机程序的运算效率。
     程序计数器：
        是一个专用的寄存器，用来表明指令序列中cpu正在执行的位置。存的值为正在执行的指令的位置，或者下一个将要呗执行的指令的位置。

     举例说明线程切换的过程： A->B
        1，先挂起线程a ,将其在cpu中的状态保存到内存中，
        2，在内存中检索下一个线程b的上下文并将其在cpu的寄存器中恢复，执行b
        3, 当b执行完，根据程序计数器指向的方向，恢复a



    */

}

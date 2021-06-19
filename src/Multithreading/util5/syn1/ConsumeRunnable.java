package Multithreading.util5.syn1;


/**
 * @Author: Wuxinwei
 * @Date: 2021/6/19 10:19
 * @Description: 消费者线程
 */
public class ConsumeRunnable implements Runnable{
    // private Product product = new Product();  不能通过new来创建
    private Product product;

    // 通过set方法来传入对象
    public ConsumeRunnable(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product){
                // 1.如果没有商品 等待
                if (!product.flag){
                    try {
                        product.wait();  // 线程等待，不仅仅释放了cpu，也释放了锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 2.有商品，就消费
                System.out.println("消费者消费了一个商品"+product.getName()+" "+product.getColor());
                // 3.改变商品的状态
                product.flag = false;
                // 4.通知其他的线程,唤醒所有等待的线程
                product.notifyAll();
            }

        }
    }
}

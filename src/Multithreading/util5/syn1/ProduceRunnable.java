package Multithreading.util5.syn1;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/19 10:18
 * @Description: 生产者线程
 */
public class ProduceRunnable implements Runnable{

    private Product product;
    public  ProduceRunnable(Product product) {
        this.product = product;
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            // 通过同步代码块的方式
            synchronized (product){
                // 生产了商品并输出，
                // 1 如果已经存在了商品，就等待
                if (product.flag){
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 2 如果没有了商品，就生产再输出

                if (i%2 == 0){
                    product.setName("馒头");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    product.setColor("白色");
                } else {
                    product.setName("玉米饼");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    product.setColor("黄色");
                }
                System.out.println("生产者生产了一个商品"+product.getName()+" "+product.getColor());

                // 3 生产完商品后，改变商品的状态
                product.flag = true;
                // 4 随机唤醒线程 唤醒
                product.notify();
            }
            i++;
        }
    }
}

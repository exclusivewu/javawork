package Multithreading.util5.syn3;

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
            product.pro(i);
            i++;
        }
    }
}

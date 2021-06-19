package Multithreading.util5;

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
            System.out.println("消费者消费了一个商品"+product.getName()+" "+product.getColor());
        }
    }
}

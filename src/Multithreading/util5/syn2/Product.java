package Multithreading.util5.syn2;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/19 10:28
 * @Description: 定义一个商品类,并且在该类中定义同步的方法
 *
 * 注意 ：使用同步方法时，当前的锁是当前的类对象，所以两个同步的方法都要写到一个类中。
 */
public class Product {
    private String name;  // 馒头，玉米饼
    private String color; // 白色，黄色
    boolean flag = false;  // 商品的状态，默认没有生产出来

    public Product(String name,String color){
        this.name = name;
        this.color = color;
    }

    public Product(){
    }

    public synchronized void con(){
        // 1.如果没有商品 等待
        if (!flag){
            try {
                // this.wait();  // 锁是当前的对象
                wait(); // 更加方便的表达
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 2.有商品，就消费
        System.out.println("消费者消费了一个商品"+name+" "+color);
        // 3.改变商品的状态
        flag = false;
        // 4.通知其他的线程,唤醒所有等待的线程
        // this.notifyAll();
        notifyAll(); // 更加方便的表达
    }

    public synchronized void pro(int i){
        // 生产了商品并输出，
        // 1 如果已经存在了商品，就等待
        if (flag){
            try {
                // this.wait(); 锁是当前的对象
                wait();  //更加方便的表达
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 2 如果没有了商品，就生产再输出

        if (i%2 == 0){
            this.name = "馒头";
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.color = "白色";
        } else {
            this.name = "玉米饼";
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.color = "黄色";
        }
        System.out.println("生产者生产了一个商品"+name+" "+color);

        // 3 生产完商品后，改变商品的状态
        this.flag = true;
        // 4 随机唤醒线程 唤醒
        // this.notify();
        notifyAll(); // 更加方便的表达

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

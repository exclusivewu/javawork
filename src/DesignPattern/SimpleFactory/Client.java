package DesignPattern.SimpleFactory;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/4 16:17
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        // 调用一个生成类的工厂方法，来获取希望得到的类，实现解耦。
        Product product = simpleFactory.createProduct(1);
        // do something with the product
    }
}

package DesignPattern.SimpleFactory;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/4 16:17
 * @Description: 通过简单工厂模式，把创建类的动作放在一个类中
 */
public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}

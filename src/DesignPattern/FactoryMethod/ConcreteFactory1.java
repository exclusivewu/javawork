package DesignPattern.FactoryMethod;

import DesignPattern.SimpleFactory.ConcreteProduct1;
import DesignPattern.SimpleFactory.Product;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/4 16:37
 * @Description:
 */
public class ConcreteFactory1 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

package DesignPattern.FactoryMethod;

import DesignPattern.SimpleFactory.ConcreteProduct2;
import DesignPattern.SimpleFactory.Product;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/4 16:38
 * @Description:
 */
public class ConcreteFactory2 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}

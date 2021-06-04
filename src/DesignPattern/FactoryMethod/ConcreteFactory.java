package DesignPattern.FactoryMethod;

import DesignPattern.SimpleFactory.ConcreteProduct;
import DesignPattern.SimpleFactory.Product;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/4 16:36
 * @Description:
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}

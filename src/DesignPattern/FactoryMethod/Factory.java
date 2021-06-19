package DesignPattern.FactoryMethod;

import DesignPattern.SimpleFactory.Product;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/4 16:07
 * @Description: 抽象类，定义了创建对象的方法    工厂方法设计模式，就是把创建实例的方法给到子类中。
 */
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}

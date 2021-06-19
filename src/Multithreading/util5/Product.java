package Multithreading.util5;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/19 10:28
 * @Description: 定义一个商品类
 */
public class Product {
    private String name;  // 馒头，玉米饼
    private String color; // 白色，黄色

    public Product(String name,String color){
        this.name = name;
        this.color = color;
    }

    public Product(){
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

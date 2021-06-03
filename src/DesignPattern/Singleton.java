package DesignPattern;

/**
 * @Author: Wuxinwei
 * @Date: 2021/6/2 10:10
 * @Description: 单例设计模式，通过单例模式可以保证在这个系统中，该类只有一个实例，一个类只有一个对象实例。
 *          具体的构造：  1 将构造函数私有化，这样在类的外部就不能用new的方式来创建对象。
 *                      2  在这个类的内部产生一个唯一的实例化对象，并且封装成private static类型
 *                      3  定义一个静态方法来返回这个对象
 */



/**懒汉单例模式
 * 在类加载的时候就已经将对象创建完毕，以后不管是否需要实例化对象，都先创建对象，很着急的样子，也叫饿汉模式。
 * 优点：实现起来简单，没有多线程同步的问题。
 * 缺点：在类加载时就创建了该对象，并且分配了内存空间，没有实例化这个类的时候就占着这个内存，效率不高消耗内存
 * */
public class Singleton {

    // 将自身实例化对象设置为一个属性，并用static、final修饰
    private static final Singleton instance = new Singleton();

    // 构造方法私有化
    private Singleton() {}

    // 静态方法返回该实例
    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * 延迟加载就是调用get()方法时实例才被创建（先不急着实例化出对象，等要用的时候才给你创建出来。不着急，故又称为“懒汉模式”），
        常见的实现方法就是在get方法中进行new实例化。
 “懒汉模式”的优缺点：

 优点：实现起来比较简单，当类SingletonTest被加载的时候，静态变量static的instance未被创建并分配内存空间，当getInstance方法第一次被调用时，
 初始化instance变量，并分配内存，因此在某些特定条件下会节约了内存。

 缺点：在多线程环境中，这种实现方法是完全错误的，根本不能保证单例的状态。
 */

class Singleton1 {

    // 将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton1 instance;

    // 构造方法私有化
    private Singleton1() {}

    // 静态方法返回该实例
    public static Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

/**实现三：线程安全的“懒汉模式”
 *优点：在多线程情形下，保证了“懒汉模式”的线程安全。
 *
 * 缺点：众所周知在多线程情形下，synchronized方法通常效率低，显然这不是最佳的实现方案。
 *
 * */
class Singleton2 {

    // 将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton2 instance;

    // 构造方法私有化
    private Singleton2() {}

    // 静态方法返回该实例，加synchronized关键字实现同步
    public static synchronized Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

/**实现四：DCL双检查锁机制（DCL：double checked locking）
 * 方法四算是单例模式的最佳实现方式。内存占用率高，效率高，线程安全，多线程操作原子性
 * */
class Singleton4 {

    // 将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton4 instance;

    // 构造方法私有化
    private Singleton4() {}

    // 静态方法返回该实例
    public static Singleton4 getInstance() {
        // 第一次检查instance是否被实例化出来，如果没有进入if块
        if(instance == null) {
            synchronized (Singleton4.class) {
                // 某个线程取得了类锁，实例化对象前第二次检查instance是否已经被实例化出来，如果没有，才最终实例出对象
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}

/**单例模式1 饿汉模式设计模式*/
class TestSingleton1{
    // 在构造器之前就要先创建对象
    private final static  TestSingleton1 testsingleton1 = new TestSingleton1();

    // 私有化构造器,不能通过构造器来创建对象。
    private TestSingleton1() {}

    // 创建公共的静态方法，静态方法不用创建对象，直接用类就可以调用,返回创建的实例
    public static TestSingleton1 getTestSingleton1(){
        return testsingleton1;
    }

}

/**单例模式2 懒汉设计模式*/
class TestSingleton2{

    private static TestSingleton2 testsingleton2;

    // 私有化构造器
    private TestSingleton2(){}

    // 提供对象
    public static TestSingleton2 getTestsingleton2(){
        if (testsingleton2 == null){
            testsingleton2 = new TestSingleton2();
        }
        return testsingleton2;
    }

}

/**单例模式3 线程安全的懒汉设计模式*/
class TestSingleton3{

    private static TestSingleton3 testsingleton3;

    // 私有化构造器
    private TestSingleton3(){}

    // 提供对象
    public static synchronized TestSingleton3 getTestsingleton3(){
        if (testsingleton3 == null){
            testsingleton3 = new TestSingleton3();
        }
        return testsingleton3;
    }

}

/**单例模式4 优化的线程安全方法*/
class TestSingleton4{

    private static TestSingleton4 testsingleton4;

    // 私有化构造器
    private TestSingleton4(){}

    // 提供对象
    public static TestSingleton4 getTestsingleton4(){
        if (testsingleton4 == null){
            synchronized (TestSingleton4.class) {
                // 某个线程取得了类锁，实例化对象前第二次检查instance是否已经被实例化出来，如果没有，才最终实例出对象
                if (testsingleton4 == null) {
                    testsingleton4 = new TestSingleton4();
                }
            }
        }
        return testsingleton4;
    }

}
package InterfaceKey;

/**
 * Interface:
 * 1. Java不支持类多继承，有了接口，就可以得到多重继承的效果。有时必须从几个类中抽取出一些共同的特征。
 *    接口就是规范，定义的是一组规则，体现了现实世界中"如果你是/要....则必须能....."的思想。
 *    继承是一个"是不是"的关系，而接口实现则是"能不能"的关系，仅仅具有相同的行为特征而已。接口的本质是契约、标准、规范。
 *
 * 2.Java中，接口和类是并列的两个结构。
 *
 * 3.定义接口，接口中的成员：
 *   3.1 JDK7及以前：只能定义全局常量和抽象方法
 *                  全局常量：(public static final) 但是书写时可以省略不写。
 *                  抽象方法：public abstract
 *   3.2 JDK8：除了定义全局常量和抽象方法外，还可以定义静态方法、默认方法
 *
 *
 * 4.接口中不能定义构造器！Interface cannot have constructor. 意味着接口不可以实例化。（抽象类不可以实例化但是有构造器）。
 *
 * 5.Java开发中，接口通过让类去实现（Implements)的方式使用。
 *   如果实现类覆盖了接口中的所有抽象方法，则此实现类可以实例化。
 *   如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类（abstract）。
 *
 * 6.Java类可以实现多个接口-----弥补了Java类的单继承性的局限性问题。
 *
 * 7.格式：class AA extends BB implements CC,DD,EE{}; //继承和实现多个接口。先写继承，后写实现。
 *
 * 8.接口和接口之间的关系：继承；接口与接口之间是可以继承并且多继承的。
 *                    比如：interface CC extends AA,BB{};
 *
 * 9.接口的具体使用，体现多态性。（抽象类和接口都不可以实例化）
 *
 *
 */

public class InterfaceTest {
    public static void main(String[] args) {
        //全局常量可以通过"接口.全局常量"的方式访问全局常量：
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.start);

        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }

}

interface Flyable{
    //全局常量
    public static final double MAX_SPEED = 7900; //第一宇宙速度7900米/秒；Escape velocity (宇宙速度)
    public static final double MIN_SPEED = 1;
    int start = 1; //可以省略public static final，但依旧是全局常量，可以通过类调用，并且不可更改。

    //抽象方法：
    public abstract void fly();

    public abstract void stop(); //也是可以省略public abstract，但仍是抽象方法。

}

interface Attack{
    void attack(); //省略public abstract，但仍是抽象方法。
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Plane can fly via take off.");
    }

    @Override
    public void stop() {
        System.out.println("Plane can stop via taxi.");
    }
}

abstract class Kite implements Flyable{ //没有完全覆盖接口的所有abstract方法，此类仍为abstract类。

    @Override
    public void fly() {
        System.out.println("Kite can fly via wind.");
    }
}

class Bullet  extends Object implements Flyable,Attack,CC{ //实现多个接口，中间用逗号"，"；
    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{ //接口多继承。

}

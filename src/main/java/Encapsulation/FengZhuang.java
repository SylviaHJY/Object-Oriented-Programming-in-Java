package Encapsulation;

/**
 * 一、封装的优点
 * 1. 良好的封装能够减少耦合。
 *    高内聚：类的内部数据操作细节自己完成，不允许外部干涉。
 *    低耦合：仅对外暴露少量的方法用于使用。
 *
 * 2. 类内部的结构可以自由修改。
 *
 * 3. 可以对成员变量进行更精确的控制。
 *
 * 4. 隐藏信息，实现细节。
 *
 * 采用 this 关键字是为了解决实例变量（private String name）和局部变量（setName(String name)中的name变量）之间发生的同名的冲突。
 *
 * 二、封装性的体现：（不等同于封装性）
 * 我们将类的属性私有化（private), 同时，提供公共的（public)的方法来获取（getXXX)和设置（setXXX)此属性的值。
 *
 * 封装性的其他体现：1. 属性私有化 2. 方法私有化 3. 单例模式。4. 如果不希望类在包外被调用，可以将类设置成缺省的。
 *
 * 三、封装性的体现需要权限修饰符来配合。
 * 1.  JAVA规定的4种权限（从小到大）：private（只有类内部能访问）、
 *                               缺省 (default) （类内部、同一个包）
 *                                protected（类内部、同一个包、不同包的子类）
 *                                public（类内部、同一个包、不同包的子类、同一个工程）
 *
 * 2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类。
 * 3. 对于class的权限修饰只可以用public和default(缺省）。如果不希望类在包外被调用，可以将类设置成缺省的。
 *
 * 4.权限从小到大顺序为：private < 缺省 < protected < public
 */

public class FengZhuang {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Mocha";
        System.out.println(a.name);
        a.setLegs(4);
        a.show();
        a.setLegs(3);
        a.show(); // 3不能被2整除，不能赋值。
        System.out.println(a.getLegs());
        System.out.println(a.getAge());
        a.setAge(25.5);
        System.out.println(a.getAge());
    }


}

class Animal{
    String name;
    private double age;
    private int legs; //声明成legs的属性，不可见，通过setLegs接口调用。体现了封装性，或者说是隐藏性。

    // 对属性的设置
    public void setLegs(int l){ // 通过方法进行限制条件的添加，
        // 同时需要避免用户再使用"对象.属性"的方式对属性进行赋值，则需将属性声明为私有的（private)。此时，针对于属性就体现了封装性。
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }else{
            legs = 0;
            // 或抛出一个异常
        }
    }

   // 对属性的获取
    public int getLegs(){
        return legs;
    }

    //提供关于属性age的set和get方法：
    public double getAge(){
        return age;
    }

    public void setAge(double a){
        if(a >= 0){
            age = a;
        }else{
            age = 0;
        }

    }

    public void eat(){
        System.out.println("It can eat.");
    }
    //不需要形参
    public void show(){
        System.out.println("name : " + name + ", age : " + age + ", legs : " + legs);
    }
}

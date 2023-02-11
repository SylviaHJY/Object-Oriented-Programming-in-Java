package Extends;

/**
 * 继承性
 * Student继承了(inheritance)Person类，具有Person类的属性和方法。
 * 继承性的优点：1.减少了代码的冗余，提高了代码的复用性。
 *             2.便于功能的扩展。
 *             3.为之后的多态性的使用提供了前提。
 *
 * 二、继承性的格式： class A extends B{}
 *                 A:子类、派生类、subclass
 *                 B:父类、超类、基类、superclass
 *
 *                 一旦子类A继承父类B后，子类A中就获得了父类B中声明的结构：属性、方法；
 *                 特别的，父类中声明为private的属性或方法，子类继承父类后，仍然认为获取了父类中私有的结构。只是因为封装性的影响，
 *                 子类不能直接调用父类的私有的结构。
 *
 *                 子类继承父类后，子类还可以声明自己特有的属性和方法，实现功能的拓展。
 *                 子类和父类的关系，不同于集合和子集的关系。
 *
 * 三、 Java中关于继承的规定：1.一个子类（subclass)只能有一个父类（superclass)：单继承。Java中类的单继承性。
 *                         2.一个父类可以被多个子类继承。
 *                         3.子父类是相对关系，多层继承关系，如：　graduate子类继承student类，student是graduate的父类。
 *                         4.子类直接继承的父类称为直接父类，间接继承的父类叫间接父类。
 *                         5.子类继承父类后，就获取了直接父类以及间接父类中声明的属性和方法。
 *
 *    JAVA规定的4种权限（从小到大）：private（只有类内部能访问）、
 *  *                           缺省 (default) （类内部、同一个包）
 *  *                            protected（类内部、同一个包、不同包的子类）//子类----继承父类，extends
 *  *                            public（类内部、同一个包、不同包的子类、同一个工程）
 *
 *                               继承可以跨包继承。(跨包普通类（非子类）不能继承private,default,protected声明的属性和方法。）
 *
 *四、Objects类的理解：1.如果我们没有显式的声明一个类的父类的话，则此类继承于java.lang.Object类。
 *                   2.所有的java类（除java.lang.Object类之外）都直接或间接的继承于java.lang.Object类。
 *                   3.所有的java类具有java.lang.Object类声明的功能。
 *                   4.Object类中的功能（属性、方法）就具通用性。
 *                   方法；equals()/ toString() / getClass()/ hashCode()/ clone()/ finalize()/ wait()/
 *                   notify()/ notifyAll()
 *                   5.Object类只声明了一个空参的构造器。
 *                   6.Object-----类、引用（数组）、接口。数组也是一个Object的子类。
 *
 *
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 12;
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        s1.sleep();
        s1.name = "Tom";
        s1.age = 10;

        s1.setGender("Female");
        System.out.println(s1.getGender());
        s1.show();

        s1.breath(); //直接父类继承了creature, 所以也继承了间接父类creature的方法。
    }
}

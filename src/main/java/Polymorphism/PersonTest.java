package Polymorphism;

import java.sql.Connection;

/**
 * 面向对象特征之三：多态性（一个事物的多种形态）特指对象的多态性，父类的引用指向子类的对象（子类的对象赋给父类的引用）
 * 多态的语法格式
 * 父类类名 引用名称 = new 子类类名();
 *当是多态时，该引用名称只能访问父类中的属性和方法，但是访问的时候，会优先访问子类重写以后的方法。
 *
 * 多态的使用：虚拟方法调用 (Virtual Method Invocation)
 *           有了对象的多态性以后，在编译期只能调用父类中声明的方法，在运行期，实际执行的是子类重写父类的方法。
 *           总结：编译：看左边，运行：看右边
 *
 * 多态性的使用前提：1.类的继承关系 2.方法的重写 3.父类引用指向子类对象，即：父类类名 引用名称 = new 子类类名()
 * 子类可以获取父类中private权限的属性和方法。如果父类把私有的属性或方法放进了public的方法中，子类调用的时候顺带就调用了私有的属性和方法。
 * 抽象类、接口的使用肯定体现了多态性。（抽象类、接口不能实例化。）
 *
 * 对象的多态性只适用于方法（方法编译看左边，运行看右边），不适用于属性（编译和运行都看左边）！！！属性不会被覆盖，重写方法会。
 *
 * 面试题：多态是编译时行为还是运行时行为？答案：运行时行为。在多态的情况下，将此时父类的方法称为虚拟方法，父类根据赋给它的不同的子类对象，
 * 动态调用属于子类的该方法。这样的方法调用在编译期是无法确定的。
 *
 * 方法的重载和重写：
 * 重载，是允许存在多个同名方法，而这些方法的参数不同，它们的调用地址在编译期就绑定了。JAVA的重载是可以包括父类和子类的，即子类可以重载父类
 * 的同名不同参数的方法。所以，对于重载而言，在方法调用之前，编译器就已经确定了所要调用的方法，这称为"早绑定"或"静态绑定"。
 *
 * 而对于多态，只有等到方法调用的那一刻，编译器才会确定所要调用的具体方法，这称为"晚绑定"或"动态绑定"。
 * 引用一句Bruce Eckel的话："不要犯傻，如果它不是晚绑定，它就不是多态。"
 *
 * 有了对象的多态性后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致编译时，只能调用父类中声明的属性和方法。
 *
 * 如何调用子类特有的属性和方法？
 * 向下转型，使用强制类型转换符：
 * Man m1 = (Man)p;
 *
 * ClassCastException类型转换异常，instanceof关键字的使用：a instanceof A: 判断a是否是A的实例，如果是，返回true,不是返回 false。
 *       使用情境：为了避免在向下转型时出现ClassCastException类型转换异常，在向下转型之前先进行instanceof的判断，一旦返回true,
 *       就进行向下转型，如果返回　false，　不进行向下转型。对声明的子类类型进行判断。
 *
 *       如果a instanceof A返回true,b instanceof B返回true,类B是类A的父类。
 *
 * 举例：Sub S = new Sub(); Base b = S; // 多态性； b == S ------True;
 *          ==，对于引用数据类型来讲，比较的是两个引用数据类型变量的地址值是否相同。
 *
 */
public class PersonTest {
    public static void main(String[] args) {
        // 父类的引用指向子类的对象
        Person p = new Man(); //对象的多态性的体现
        Person p1 = new Woman(); // 子类对象多种形态

        //多态的使用：当调用子父类同名参数的方法时，实际执行的时子类重写父类的方法---虚拟方法调用
        p.eat();
        p1.eat();
        p.walk();
        // p.earnMoney() 不能调用，有了多态性后不能调用子类特有的方法，p在编译时是person类型，在person类没有earnMoney方法。
        // 非static的类，new的对象是有子类的属性和方法的，但是因为把类型声明成了person,不能调用自己的属性和方法。

        //向下转型，使用强制类型转换符, 转换后可以调用子类的属性和方法。
        Man m1 = (Man)p;
        m1.isSmoking = true;
        m1.earnMoney();
        //使用强转时可能出现ClassCastException类型转换异常
        // woman w1 = (Man)p;
        // w1.goShopping(); 运行失败，ClassCastException类型转换异常，new Man() 声明成男人不能转换成女人。

        if(p instanceof Woman){
            Woman w1 = (Woman)p;
            w1.goShopping();
            System.out.println("********Woman*******");
        }

        if(p instanceof Man){
            m1.earnMoney();
            System.out.println("*******Man********");
        }

        // 问题一：编译时通过，运行时不通过
        //举例一：
        // Person p = new Woman();
        // Man p = (Man)p;  new的是Woman不能转成Man.
        //举例二：
        // Person p = new Person();
        // Man p = (Man)p; new的是Man的父类，不能强转成子类。

        // 问题二：编译不通过
        //  Man p = new Woman(); 左边必须是父类，父类的引用指向子类的对象（子类的对象赋给父类的引用）


    }
}

//举例：
class Driver{
    public void doData(Connection conn){ // import java.sql.Connection; conn = new MySQLConnection();
                                         // conn = new OracleConnection(); 和Oracle的连接；
        //规范的步骤操作数据 //  SQL和Oracle都重写了下面重名的方法，则调用方法执行的时候执行的是子类重写过的方法。
        // conn.method1();
        // conn.method2();
        // conn.method3();
    }
}

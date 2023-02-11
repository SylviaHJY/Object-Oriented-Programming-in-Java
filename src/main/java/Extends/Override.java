package Extends;

/**
 * 方法的重写：Override / Overwrite
 *
 * 1.重写：子类继承父类时，可以对父类中同名同参的方法，进行覆盖操作。
 * 2.应用：重写后，当创建子类对象时，通过子类对象调用子父类中的同名同参数的方法时，实际执行的时子类重写父类的方法。
 *
 * 3.重写的规定：
 *           1.方法的声明：权限修饰符、返回值类型、方法名（形参列表）{
 *               // 方法体
 *           }
 *           1.子类中的叫重写的方法，父类中的叫被重写的方法。
 *           子类重写的方法的方法名和形参列表与父类被重写的方法的（方法名）和（形参列表）相同。
 *           2.子类重写方法的权限修饰符不小于父类被重写的方法的权限修饰符。（可以相等）
 *           3 ！！特殊情况：子类不能重写父类中声明为private的方法。（改成public不报错但不叫重写）！！
 *             比如；父类中有一个private void show(){}方法，子类中改成public void show(){}，不叫重写，并且在子类中调用
 *             show()方法调用的是父类private show()方法。
 *
 *           4.返回值类型：父类被重写的返回值是void，则子类重写的方法的返回值类型只能是void.
 *                       父类被重写的方法的返回值类型是A类型，则子类重写的方法返回值类型可以是A类或A的子类。
 *                       如；父类中的方法 public Object info(){}，子类重写可以是 public String info(){}。string是Object的子类。
 *                       父类被重写的方法的返回值类型是基本数据类型，则重写的方法返回值必须是相同的返回值类型。比如double ,int都要相同。
 *
 *           5.子类重写的方法抛出的异常类型不大于父类被重写的方法的异常类型。
 *
 *           6.子类和父类中的同名同参的方法要么都声明为非static（重写的必须是非static的），
 *           可以都声明为static，但这两种方法就不是重写（static的方法不会被子类覆盖）。
 *
 *           7、方法重写的规则之一：子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型。同5。
 *
 *
 * 面试题：区分方法的重载和重写
 * 重写是子类对父类的允许访问的方法的实现过程进行重新编写！返回值和形参都不能改变。即外壳不变，核心重写！
 *  *
 *  * 重写的好处在于子类可以根据需要，定义特定于自己的行为。
 *  *
 *  * 也就是说子类能够根据需要实现父类的方法。
 *  *
 *  * 在面向对象原则里，重写意味着可以重写任何现有方法。
 *
 */
public class Override {
/**
 * 以下例子说明：protected是不同包中对子类可见，对非子类不可见。
 *
 * 例1.2.2.a:---本例为正常用法。
 *
 * package p1;
 * public class A {
 *     protected int i;
 *     protected void printIProtected() {
 *         System.out.println("i=" + i);
 *     }
 * }
 *
 *
 * package p2;
 * import p1.A;
 * class B extends A {
 *     void printIInB() {
 *         System.out.println("in B i=" + i);//protected是不同包中对子类（Test）可见，马 克-t o-w i n
 *         printIProtected();
 *     }
 * }
 *
 * public class Test  {
 *     public static void main(String[] args) {
 *         A a=new A();
 *    //     a.i=7;//报错， 注意这里不能直接用
 *  //       a.printIProtected();//报错， 注意这里不能直接用
 *         B b = new B();
 *  //     b.i = 10;//报错，Test不是A子类，非子类不能访问protected
 *  //     b.printIProtected();//报错，Test不是A子类，非子类不能访问protected
 *         b.printIInB();
 *     }
 * }
 *
 *
 *
 * 结果：
 * in B i=0
 * i=0
 *
 * ————————————————
 *
 */
}

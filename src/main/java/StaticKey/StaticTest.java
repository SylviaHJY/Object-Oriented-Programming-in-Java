package StaticKey;

/** static 关键字的使用：
 * 1. 静态的
 * 2. static可以用来修饰属性、方法、代码块、内部类
 *    在Java中切记：static是不允许用来修饰局部变量。也不能用来修饰构造器。
 *
 * 3. 使用static修饰属性：静态变量（类变量）
 *    static变量也称作静态变量，静态变量和非静态变量的区别是：静态变量被所有的对象所共享，在内存中只有一个副本，
 *    它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，存在多个副本，各个对象拥有的副本互不影响。
 *    static成员变量的初始化顺序按照定义的顺序进行初始化。
 *
 *       3.1 属性，按是否使用static修饰，又分为：静态属性 vs 非静态属性（实例变量）
 *           实例变量：每个对象都拥有一套类中的非静态属性。当修改其中一个对象中的非静态属性时，不会导致其他对象中同样属性值的修改。
 *           静态变量：静态变量被所有的对象所共享，在内存中只有一个副本，当通过某一个对象修改静态变量时，会导致其他对象 调用此静态变量时，
 *                    是修改后的值。
 *
 *      3.2  static修饰属性的其他说明：
 *            1、静态变量随着类的加载而加载，可以通过 "类.静态变量" 的方式进行使用。实例对象随着对象的创建而加载。
 *            2、静态变量的加载早于对象的创建。
 *            3、由于类只会加载一次，静态变量在内存中也只会存在一份，在方法区的静态域中。
 *            4、 类-----可以调用类变量------------不可以调用实例变量
 *               对象---------可以调用类变量--------可以调用实例变量
 *
 *      3.3 静态属性举例：System.out; Math.PI;
 *
 *      3.4 内存解析：
 *          栈：局部变量
 *          堆：new出来的结构：对象、数组
 *          方法区：类的加载信息、静态域、常量池
 *
 *
 *
 *
 * 4. 使用static修饰方法：静态方法
 *    static方法一般称作静态方法，由于静态方法不依赖于任何对象就可以进行访问，因此对于静态方法来说，是没有this的，因为它不依附于任何对象，
 *    既然都没有对象，就谈不上this了。并且由于这个特性，在静态方法中不能访问类的非静态成员变量和非静态成员方法，
 *    因为非静态成员方法/变量都是必须依赖具体的对象才能够被调用。
 *
 *         4.1 随着类的加载而加载，可以通过"类.静态方法"的方式进行调用。
 *
 *         4.2 类--------可以调用静态方法--------不可以调用非静态方法
 *             对象---------可以调用静态方法------可以调用非静态方法
 *
 *         4.3 静态方法中，只能调用静态的方法/属性。在静态方法中不能访问类的非静态成员变量和非静态成员方法。
 *             非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性。
 *
 * 5. static注意点：
 *        在静态的方法内，不能使用this，super关键字。
 *
 * 6. 开发中，如何确定一个属性是否要声明为static？
 *       属性是可以被多个对象所共享的，不会随对象的不同而不同的。
 *       final: 类中的常量也常常被声明为static。
 *  *        public static final double PI = 3.14159265358979323846
 *
 *    开发中，如何确定一个方法是否声明为static？
 *        操作静态属性的方法通常设置为静态。
 *        工具类中的方法习惯上声明为static。比如：Math, Arrays, Collections
 *
 *
 *
 *
 *
 */
public class StaticTest {
    public static void main(String[] args) {

        //在对象创建前就可以加载static属性：
         Chinese.nationality = "china";

        Chinese c1 = new Chinese();
        c1.name = "Jorry";
        c1.age = 29;
        c1.nationality = "CHN"; // 此时c2,c3的nationality也变成了"CHN"。
        System.out.println(c1.nationality);


        Chinese c2 = new Chinese();
        c2.name = "Paul";
        c2.age = 30;
        c2.nationality = "CHINA"; // 此时c1 c2 c3的nationality都是"CHINA"。

        Chinese c3 = new Chinese();
        c3.name = "Kim";
        c3.age = 33;
        System.out.println(c3.nationality); //CHINA
        System.out.println(c1.nationality); //CHINA

        Chinese.show();
        System.out.println("********************************");
        c1.info();

    }
}

class Chinese{
    String name;
    int age;
    static String nationality;

    public void eat(){
        System.out.println("Chinese cuisine");
    }

     public static void show(){ //不能调用非静态的结构
         System.out.println("Chinese");
         System.out.println(nationality); // 省略的不是this. ， 省略的是类. , 是Chinese.
     }

     public void info(){ // 非静态方法可以调用静态方法也可以调用非静态方法。
        show();
        eat();
     }


}
